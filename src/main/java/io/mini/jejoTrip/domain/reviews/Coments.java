package io.mini.jejoTrip.domain.reviews;

import static javax.persistence.FetchType.LAZY;

import io.mini.jejoTrip.domain.reviews.repository.ReviewRepository;
import io.mini.jejoTrip.domain.users.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Coments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "root_coment_id")
    private Coments rootComents;

    @Column
    private String content;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "users", referencedColumnName = "id")
    private Users users;


    }

