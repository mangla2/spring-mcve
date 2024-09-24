package org.company.service.impl;

import javax.xml.ws.Response;

import org.company.service.controller.HelloWorldService;
import org.company.service.annotation.ValidateAuthToken;

public class HelloWordServiceImpl extends HelloWorldService {
    @ValidateAuthToken
    @Override
    public Response checkStatus() {
        return Response.ok().build();
    }
}
