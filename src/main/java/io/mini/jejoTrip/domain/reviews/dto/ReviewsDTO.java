package io.mini.jejoTrip.domain.reviews.dto;

import io.mini.jejoTrip.domain.reviews.Reviews;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

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
