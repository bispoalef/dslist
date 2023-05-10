package com.bispoalef.dslist.dto;

import com.bispoalef.dslist.entities.Game;
import com.bispoalef.dslist.projection.GameMinProjection;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
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

    public GameMinDTO(GameMinProjection gameMinProjection) {
        id = gameMinProjection.getId();
        titulo = gameMinProjection.getTitulo();
        ano = gameMinProjection.getAno();
        imgUrl = gameMinProjection.getUrlImagem();
        descricaoResumida = gameMinProjection.getDescricaoResumida();
    }
}
