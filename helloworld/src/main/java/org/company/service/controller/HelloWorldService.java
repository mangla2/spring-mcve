package org.company.service.controller;

import javax.xml.ws.Response;

@Path("/v1")
@Produces({ MediaType.APPLICATION_JSON })
@Consumes({ MediaType.APPLICATION_JSON })
public interface HelloWorldService {

    @GET
    @Path("/check/health")
    Response checkStatus();
}
