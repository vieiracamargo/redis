package com.example;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class GameNotFoundMapper implements ExceptionMapper<GameNotFoundException> {
    @Override
    public Response toResponse(GameNotFoundException e) {
        return Response.status(Response.Status.NOT_FOUND)
                .entity(new Error(e.getMessage()))
                .build();
    }
}
