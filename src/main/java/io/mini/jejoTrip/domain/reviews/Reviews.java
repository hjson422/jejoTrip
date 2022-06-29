package io.mini.jejoTrip.domain.reviews;

import static javax.persistence.FetchType.*;

import io.mini.jejoTrip.domain.reviews.dto.ReviewsDTO;
import io.mini.jejoTrip.domain.users.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title; // rev_title

    @Column
    private String content;

    @Column
    private String tags;

    @Column
    private String places;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "users", referencedColumnName = "id")
    private Users users;

    public ReviewsDTO convertToReviewsDTO(){
        return ReviewsDTO.builder()
            .content(this.content)
            .places(this.places)
            .tags(this.tags)
            .title(this.title)
            .id(this.id)
            .usersDTO(this.users.convertToUsersDTO()).build();
    }

}
