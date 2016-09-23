package com.openshift.evg.roadshow.rest;

import com.openshift.evg.roadshow.model.View;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@ApplicationScoped
@Path("/view")
public class MLBParksView {

    @GET
    @Produces("application/json")
    @Path("initialview")
    public View getInitialView() {
        System.out.println("[DEBUG] getInitialView");

        return new View("MLBParks on OpenShift 3", "39.82", "-98.57", 5);
    }
}
