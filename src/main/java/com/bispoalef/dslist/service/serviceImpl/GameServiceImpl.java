package com.bispoalef.dslist.service.serviceImpl;

import com.bispoalef.dslist.dto.GameDTO;
import com.bispoalef.dslist.dto.GameMinDTO;
import com.bispoalef.dslist.entities.Game;
import com.bispoalef.dslist.projection.GameMinProjection;
import com.bispoalef.dslist.repository.GameRepository;
import com.bispoalef.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameServiceImpl implements GameService {

    @Autowired
    GameRepository gameRepository;

    @Override
    public List<GameDTO.Response.myGameDTO> buscar(Long id) {
        return gameRepository.buscar(id);
    }

    @Override
    public List<GameMinDTO> buscarTodos() {
        List<Game> result = gameRepository.findAll();

        return result.stream().map(GameMinDTO::new).toList();
    }

    @Override
    public List<GameMinDTO> buscarPorList(Long id) {
        List<GameMinProjection> result = gameRepository.buscarPorList(id);

        return result.stream().map(GameMinDTO::new).toList();
    }

}

