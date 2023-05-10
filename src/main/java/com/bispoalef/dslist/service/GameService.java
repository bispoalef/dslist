package com.bispoalef.dslist.service;

import com.bispoalef.dslist.dto.GameDTO;
import com.bispoalef.dslist.dto.GameMinDTO;
import com.bispoalef.dslist.entities.Game;
import com.bispoalef.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
       Game result =  gameRepository.findById(id).get();

        return new GameDTO(result);
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
       List<Game> result =  gameRepository.findAll();

        return result.stream().map(GameMinDTO::new).toList();
    }
}
