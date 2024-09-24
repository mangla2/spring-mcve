package org.company.service.controller;

import javax.xml.ws.Response;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public interface HelloWorldService {

    @GET
    @Path("/check/health")
    Response checkStatus();
}
