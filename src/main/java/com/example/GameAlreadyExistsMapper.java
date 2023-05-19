package com.example;

import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class GameAlreadyExistsMapper implements ExceptionMapper<GameAlreadyExistsException> {
    @Override
    public Response toResponse(GameAlreadyExistsException e) {
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(new Error(e.getMessage()))
                .build();
    }
}
