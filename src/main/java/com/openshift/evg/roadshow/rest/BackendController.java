package com.openshift.evg.roadshow.rest;

import com.openshift.evg.roadshow.rest.gateway.model.Backend;
import com.openshift.evg.roadshow.rest.gateway.model.Coordinates;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * Provides information about this backend
 *
 * Created by jmorales on 26/09/16.
 */
@Path("/info")
public class BackendController{
    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public Backend get() {
        return new Backend("mlbparks", "AMAZING MLB Parks", new Coordinates("39.82", "-98.57"), 5);
    }
}
