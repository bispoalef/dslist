package com.bispoalef.dslist.repository;

import com.bispoalef.dslist.entities.Game;
import com.bispoalef.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
