package com.bispoalef.dslist.controller;


import com.bispoalef.dslist.dto.GameDTO;
import com.bispoalef.dslist.dto.GameMinDTO;
import com.bispoalef.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    GameService gameService;

    @GetMapping(value = "buscar")
    public  List<GameDTO.Response.myGameDTO> buscar(
            @RequestParam(required = false) Long id){
        return gameService.buscar(id);
    }

    @GetMapping()
    public List<GameMinDTO> findAll(){
        return gameService.buscarTodos();
    }
}
