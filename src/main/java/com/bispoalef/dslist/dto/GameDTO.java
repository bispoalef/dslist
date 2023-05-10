package com.bispoalef.dslist.dto;

import com.bispoalef.dslist.entities.Game;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;


@NoArgsConstructor
@Getter
@Setter
public class GameDTO {

    private Long id;
    private String titulo;
    private Integer ano;
    private String genero;
    private String plataforma;
    private Double nota;
    private String imgUrl;
    private String descricaoResumida;
    private String descricaoCompleta;


    public GameDTO(Game game) {
        BeanUtils.copyProperties(game, this);
    }
}
