package com.bispoalef.dslist.repository;

import com.bispoalef.dslist.entities.Game;
import com.bispoalef.dslist.projection.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game, Long> {

    @Query(nativeQuery = true, value = """
        SELECT game.ID, game.TITULO, game.ANO AS ano, game.IMG_URL AS urlImagem, game.DESCRICAO_RESUMIDA AS descricaoResumida, pertence.POSICAO
        FROM TB_GAME game
        INNER JOIN TB_PERTENCE pertence ON game.ID = pertence.GAME_ID
        WHERE pertence.LIST_ID = ?1
        ORDER BY pertence.POSICAO
  """)
    List<GameMinProjection> buscarPorList(Long listId);
}
