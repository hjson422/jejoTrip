package io.mini.jejoTrip.domain.users.dto;

import io.mini.jejoTrip.domain.users.Users;
import javax.persistence.Column;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class UsersDTO {

    private Long id;


    private String email; //사용자 e-mail


    private String password;


    private String name;


    private String nickName;


    private String sex;


    private Integer age;


    public Users toEntity(){
        return Users.builder()
            .email(this.email)
            .password(this.password)
            .name(this.name)
            .nickName(this.nickName)
            .sex(this.sex)
            .age(this.age)
            .build();
    }
}
