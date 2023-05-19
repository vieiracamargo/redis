package com.example;

public interface GeneralRepository {
    boolean persistIfDoesNotExists(String key, Game game);
    void persist(String key, Game game);

    Game findGameBykey(String key);

}
