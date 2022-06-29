package io.mini.jejoTrip.domain.users;

import io.mini.jejoTrip.domain.users.dto.UsersDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String email; //사용자 e-mail

    @Column
    private String password;

    @Column
    private String name;

    @Column
    private String nickName;

    @Column
    private String sex;

    @Column
    private Integer age;


    public UsersDTO convertToUsersDTO(){
        return UsersDTO.builder()
            .id(this.id)
            .email(this.email)
            .password(this.password)
            .name(this.name)
            .nickName(this.nickName)
            .sex(this.sex)
            .age(this.age)
            .build();
    }


}