package io.mini.jejoTrip.domain.reviews.dto;

import io.mini.jejoTrip.domain.reviews.Reviews;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ReviewsDTO {
    private Long id;
    private String revTitles;
    private String tags;
    private String contents;
    private String nickNames;
    private String places;



    public Reviews toEntity() {
        Reviews reviews = Reviews.builder()
                .revTitles(revTitles)
                .tags(tags)
                .contents(contents)
                .places(places)
                .nickNames(nickNames)
                .build();
        return reviews;
    }
}
