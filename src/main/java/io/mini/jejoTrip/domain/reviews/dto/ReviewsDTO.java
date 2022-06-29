package io.mini.jejoTrip.domain.reviews.dto;

import static javax.persistence.FetchType.LAZY;

import io.mini.jejoTrip.domain.reviews.Reviews;
import io.mini.jejoTrip.domain.users.Users;
import io.mini.jejoTrip.domain.users.dto.UsersDTO;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class ReviewsDTO {
    private Long id;


    private String title; // rev_title


    private String content;


    private String tags;


    private String places;


    private UsersDTO usersDTO;


    public Reviews toEntity(){
        return Reviews.builder()
            .title(this.title)
            .content(this.content)
            .tags(this.tags)
            .places(this.places)
            .users(this.usersDTO.toEntity()).build();
    }
}
