package com.snva.apisoap.endpoints;

import com.snva.ex.soap.xml.user.*;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {

    private  static  final String  NAMSPACE_URL= "http://snva.com/ex/soap/xml/user";



    @PayloadRoot(namespace = NAMSPACE_URL, localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUser(@RequestPayload GetUserRequest request){
    GetUserResponse response = new GetUserResponse();
        User user = new User();
        user.setName(request.getUserName());
        user.setDob("10/092022");
        user.setContact("01234567");
        user.setEmail("bamenda@gmail.com");
        user.setAddress("Etoudi");
        user.setCourse("SNVA Full Stack");
        response.setUser(user);

        return response;

    }
}
