package com.bispoalef.dslist.controller;


import com.bispoalef.dslist.dto.GameListDTO;
import com.bispoalef.dslist.service.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/gameList")
public class GameListController {

    @Autowired
    GameListService gameListService;


    @GetMapping()
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }
}
