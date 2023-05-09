package com.bispoalef.dslist.dto;

import com.bispoalef.dslist.entities.Game;
import lombok.Getter;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@Getter
public class GameMinDTO {

    private Long id;
    private String titulo;
    private Integer ano;
    private String imgUrl;
    private String descricaoResumida;

    public GameMinDTO(Game game) {
        this.id = game.getId();
        this.titulo = game.getTitulo();
        this.ano = game.getAno();
        this.imgUrl = game.getImgUrl();
        this.descricaoResumida = game.getDescricaoResumida();
    }
}
