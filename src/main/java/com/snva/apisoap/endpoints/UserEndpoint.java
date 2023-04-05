package com.snva.apisoap.endpoints;

import com.snva.apisoap.service.IUserService;
import com.snva.ex.soap.xml.user.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {

    private  static  final String  NAMSPACE_URL= "http://snva.com/ex/soap/xml/user";

    @Autowired
    private IUserService service;
    @PayloadRoot(namespace = NAMSPACE_URL, localPart = "addUserRequest")
    @ResponsePayload
    public GetUserResponse addUser(@RequestPayload AddUserRequest request){
        GetUserResponse response = new GetUserResponse();
        com.snva.apisoap.model.User user = new com.snva.apisoap.model.User();
        user.setName(request.getUser().getName());
       user.setAddress(request.getUser().getAddress());
       user.setDob(request.getUser().getDob());
       user.setContact(request.getUser().getContact());
       user.setEmail(request.getUser().getEmail());
       user.setCourse(request.getUser().getCourse());
       user = service.addUser(user);
       User userRet = new User();
       userRet.setName(user.getName());
       userRet.setDob(user.getDob());
       userRet.setCourse(user.getCourse());
       userRet.setAddress(user.getAddress());
       userRet.setEmail(user.getEmail());
       userRet.setContact(user.getContact());


        response.setUser(userRet);

        return response;

    }



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
