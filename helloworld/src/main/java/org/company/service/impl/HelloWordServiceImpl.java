package org.company.service.impl;

import javax.ws.rs.core.Response;

import org.company.service.controller.HelloWorldService;
import org.company.service.annotation.ValidateAuthToken;

public class HelloWordServiceImpl implements HelloWorldService {
    @ValidateAuthToken
    @Override
    public Response checkStatus() {
        return Response.ok().build();
    }
}
