package com.openshift.evg.roadshow.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by jmorales on 11/08/16.
 */
@Path("/healthz")
public class Healthz {

    @GET
    @Produces("text/plain")
    public String healthz(){
        return "OK";
    }
}
