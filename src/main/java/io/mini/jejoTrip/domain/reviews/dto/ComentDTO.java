package io.mini.jejoTrip.domain.reviews.dto;

import io.mini.jejoTrip.domain.reviews.Coments;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ComentDTO {
    private Long coment_num;
    private String rootComent;
    private String coment;
    private String coment_users;


    public Coments toEntity() {
        Coments coment = Coments.builder()
                .coment_num()
                .rootComent()
                .coment()
                .coment_users()
                .build();

        return coment;
    }
}
