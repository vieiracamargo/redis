package com.example;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

@ApplicationScoped
@Path("/game")

public class GameController {

    @Inject
    GameService gameService;

    @POST
    public Response createGame(Game game){
        return Response.
                status(Response.Status.CREATED)
                .entity(gameService.createGame(game))
                .build();
    }

    @PUT
    @Path("{key}")
    public Response updateGame(String key, Game game){
        return Response.ok()
                .entity(gameService.updateGame(key,game))
                .build();
    }

    @GET
    @Path("{key}")
    public Response findGameByKey(String key){
        return Response.ok()
                .entity(gameService.findGameByKey(key))
                .build();
    }



}
