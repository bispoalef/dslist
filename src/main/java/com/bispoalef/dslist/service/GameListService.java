package com.bispoalef.dslist.service;

import com.bispoalef.dslist.dto.GameListDTO;
import com.bispoalef.dslist.entities.GameList;
import com.bispoalef.dslist.projection.GameMinProjection;
import com.bispoalef.dslist.repository.GameListRepository;
import com.bispoalef.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    GameListRepository gameListRepository;

    @Autowired
    GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {

       List<GameList> result =  gameListRepository.findAll();

        return result.stream().map(GameListDTO::new).toList();
    }

    @Transactional
    public void mover(Long idLista, int indexArquivo, int indexDestino){

        List<GameMinProjection> lista = gameRepository.buscarPorList(idLista);

       GameMinProjection obj =  lista.remove(indexArquivo);

       lista.add(indexDestino, obj);

       int min = Math.min(indexArquivo, indexDestino);
       int max = Math.max(indexArquivo, indexDestino);

        for (int i = min; i <= max; i++) {
            gameListRepository.updatePosicaoDaLista(idLista, lista.get(i).getId(), i);
        }
    }
}
