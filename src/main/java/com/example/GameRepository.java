package com.example;

import io.quarkus.redis.datasource.RedisDataSource;
import io.quarkus.redis.datasource.value.ValueCommands;
import jakarta.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class GameRepository implements GeneralRepository{

    private final ValueCommands<String, Game> commands;

    public GameRepository(RedisDataSource redisDataSource) {
        this.commands = redisDataSource.value(Game.class);
    }

    public boolean persistIfDoesNotExists(String key, Game game){
        //set the key to hold string value if key does not exist.
        return commands.setnx(key, game);
    }


    public void persist(String key, Game game) {
        commands.set(key, game);
    }


    public Game findGameBykey(String key){
        return commands.get(key);
    }


}
