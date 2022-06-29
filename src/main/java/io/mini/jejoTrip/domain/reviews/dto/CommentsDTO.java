package io.mini.jejoTrip.domain.reviews.dto;

import io.mini.jejoTrip.domain.users.dto.UsersDTO;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class CommentsDTO {
    private Long id;
    private UsersDTO usersDTO;
    private ReviewsDTO reviewsDTO;
    private String content;

}
