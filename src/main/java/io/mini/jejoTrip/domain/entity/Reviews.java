package io.mini.jejoTrip.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Table(name = "REVIEW_TBL")
import javax.persistence.*;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long rno;

    @Column(nullable = false)
    private String rev_title;

    @Column(nullable = false)
    private String tags;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    private String place;

    @ManyToOne
    @JoinColumn(name = "username")
    private Users users;


}
