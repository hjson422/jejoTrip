package io.mini.jejoTrip.domain.dto;

import io.mini.jejoTrip.domain.entity.Reviews;
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
public class ReviewsDTO {
    private Long rno;
    private String rev_title;
    private String tags;
    private String content;
    private String username;
    private String place;



    public Reviews toEntity() {
        Reviews reviews = Reviews.builder()
                .rev_title(rev_title)
                .tags(tags)
                .content(content)
                .place(place)
                .build();
        return reviews;
    }
}
