package com.bispoalef.dslist.service;

import com.bispoalef.dslist.dto.GameDTO;
import com.bispoalef.dslist.dto.GameMinDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public interface GameService {

    @Transactional(readOnly = true)
    List<GameDTO.Response.myGameDTO> buscar(Long id);

    @Transactional(readOnly = true)
    List<GameMinDTO> buscarTodos();

    @Transactional(readOnly = true)
    List<GameMinDTO> buscarPorList(Long id);
}
