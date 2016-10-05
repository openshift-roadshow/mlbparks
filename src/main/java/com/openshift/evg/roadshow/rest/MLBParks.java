package com.openshift.evg.roadshow.rest;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoDatabase;
import com.openshift.evg.roadshow.db.MongoDBConnection;
import com.openshift.evg.roadshow.model.DataPoint;
import org.bson.Document;

import javax.enterprise.context.ApplicationScoped;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
@Path("/data")
public class MLBParks {

    MongoDBConnection con = new MongoDBConnection();

    //@Inject
    //private DBConnection dbConnection;

    @GET
    @Path("/load")
    public String load() {
        System.out.println("[INFO] load()");
        MongoDBConnection con = new MongoDBConnection();
        List<Document> parks = con.loadParks();
        try {
            MongoDatabase db = con.connect();
            con.init(db, parks);
            return "Items inserted in database: " + con.sizeInDB(db);
        }catch(Exception e){
            System.out.println("[ERROR] Connecting to database");
        }
        return "0 Items inserted in database. Error connecting";
    }

    @GET()
    @Path("/all")
    @Produces("application/json")
    public List<? extends DataPoint> getAllDataPoints(@Context HttpServletResponse response) {
        System.out.println("[DEBUG] getAllDataPoints");

        MongoDBConnection con = new MongoDBConnection();
        try {
            MongoDatabase db = con.connect();
            return con.getAll(db);
        }catch(Exception e){
            System.out.println("[ERROR] Connecting to database");
        }
        return new ArrayList<DataPoint>();
    }

    @GET
    @Produces("application/json")
    @Path("within")
    public List<? extends DataPoint> findDataPointsWithin(@Context HttpServletResponse response, @QueryParam("lat1") float lat1,
                                                          @QueryParam("lon1") float lon1,
                                                          @QueryParam("lat2") float lat2,
                                                          @QueryParam("lon2") float lon2) {
        System.out.println("[DEBUG] findDataPointsWithin(" + lat1 + "," + lon1 + "," + lat2 + "," + lon2 + ")");


        MongoDBConnection con = new MongoDBConnection();
        try{
            MongoDatabase db = con.connect();

            // make the query object
            BasicDBObject spatialQuery = new BasicDBObject();

            ArrayList<double[]> boxList = new ArrayList<double[]>();
            boxList.add(new double[]{new Float(lat1), new Float(lon1)});
            boxList.add(new double[]{new Float(lat2), new Float(lon2)});

            BasicDBObject boxQuery = new BasicDBObject();
            boxQuery.put("$box", boxList);

            spatialQuery.put("coordinates", new BasicDBObject("$within", boxQuery));
            System.out.println("Using spatial query: " + spatialQuery.toString());


            return con.getByQuery(db, spatialQuery);
        }catch(Exception e){
            System.out.println("[ERROR] Connecting to database");
        }
        return new ArrayList<DataPoint>();
    }

    @GET
    @Produces("application/json")
    @Path("centered")
    public List<DataPoint> findDataPointsCentered(@Context HttpServletResponse response, float lat, float lon, int maxDistance, int minDistance) {

        // TODO: Implement this
        return new ArrayList<DataPoint>();
    }

}
