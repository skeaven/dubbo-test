package com.skeaven.api;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/users")
public interface UserService {

    @POST
    @Path("register")
    @Consumes({MediaType.APPLICATION_JSON})
    void registerUser(User user);

    @GET
    @Path("{username}")
    @Produces({MediaType.APPLICATION_JSON})
    User getUser(@PathParam("username") String username);
}
