package com.bispoalef.dslist.repository;

import com.bispoalef.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface GameListRepository extends JpaRepository<GameList, Long> {

    @Modifying
    @Query(nativeQuery = true,
    value = "UPDATE tb_pertence " +
            "SET posicao = ?3 " +
            "WHERE list_id = ?1 " +
            "AND game_id = ?2")
    void updatePosicaoDaLista(Long listId, Long gameId, Integer novaPosicao);
}
