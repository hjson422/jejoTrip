package io.mini.jejoTrip.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.Formula;

import javax.persistence.*;

@Table(name = "Coment")

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Coment {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long coment_num;

    @ManyToOne
    @JoinColumn(name = "root_coment_id")
    private Coment rootComent;

    @Column(nullable = false)
    private String coment;

    @ManyToOne
    @JoinColumn(name = "username")
    private Users coment_users;
}
