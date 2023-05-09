package com.bispoalef.dslist.service;

import com.bispoalef.dslist.dto.GameMinDTO;
import com.bispoalef.dslist.entities.Game;
import com.bispoalef.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public List<GameMinDTO> findAll() {

       List<Game> result =  gameRepository.findAll();

       List<GameMinDTO> dto = result.stream().map(GameMinDTO::new).toList();

        return dto;
    }
}
