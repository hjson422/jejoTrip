package io.mini.jejoTrip.domain.reviews;

import static javax.persistence.FetchType.*;

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
    private String revTitle; // rev_title

    @Column
    private String tags;

    @Column
    private String content;

    @Column
    private String place;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "users", referencedColumnName = "id")
    private Users users;

}
