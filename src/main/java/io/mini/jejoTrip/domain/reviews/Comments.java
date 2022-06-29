package io.mini.jejoTrip.domain.reviews;

import static javax.persistence.FetchType.LAZY;

import io.mini.jejoTrip.domain.reviews.dto.CommentsDTO;
import io.mini.jejoTrip.domain.users.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class Comments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column
    private String content;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "reviews", referencedColumnName = "id")
    private Reviews reviews;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "users", referencedColumnName = "id")
    private Users users;

    public static Comments ofCreate(String content, Users users, Reviews reviews) {
        Comments instance = new Comments();
        instance.content = content;
        instance.reviews = reviews;
        instance.users = users;
        return instance;
    }

    public CommentsDTO convertToCommentsDTO(){
        return CommentsDTO.builder()
            .id(this.id)
            .content(this.content)
            .reviewsDTO(this.reviews.convertToReviewsDTO())
            .usersDTO(this.users.convertToUsersDTO()).build();
    }

    public void update(String content){
        this.content = content;
    }

}

