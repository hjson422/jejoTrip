package io.mini.jejoTrip.domain.dto;

import io.mini.jejoTrip.domain.entity.Coment;
import io.mini.jejoTrip.domain.entity.Users;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Getter
@Setter
public class ComentDTO {
    private Long coment_num;
    private String rootComent;
    private String coment;
    private String coment_users;


    public Coment toEntity() {
        Coment coment = Coment.builder()
                .coment_num()
                .rootComent()
                .coment()
                .coment_users()
                .build();

        return coment;
    }
}
