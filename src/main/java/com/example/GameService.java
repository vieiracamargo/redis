package com.example;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class GameService {

    @Inject
    GameRepository gameRepository;

    private int count = 1;


    public Game createGame(Game game){
        boolean persisted = gameRepository.persistIfDoesNotExists(generateKey(), game);

        if(!persisted){
            throw new GameAlreadyExistsException("O dado já existe no banco");
        }
        return game;
    }

    public Game findGameByKey(String key){
        Game game = gameRepository.findGameBykey(key);

        if(game == null){
            throw new GameNotFoundException("O dado não existe no banco");
        }

        return game;
    }

    public Game updateGame(String key, Game newEntity){
        findGameByKey(key);
        gameRepository.persist(key, newEntity);

        return newEntity;
    }


    private String generateKey(){
        String key = "game"+ count;
        count++;
        return key;
    }

}

