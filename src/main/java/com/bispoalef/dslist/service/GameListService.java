package com.bispoalef.dslist.service;

import com.bispoalef.dslist.dto.GameListDTO;
import com.bispoalef.dslist.entities.GameList;
import com.bispoalef.dslist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    GameListRepository GameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {

       List<GameList> result =  GameListRepository.findAll();

        return result.stream().map(GameListDTO::new).toList();
    }
}
