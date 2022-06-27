package io.mini.jejoTrip.domain.users.dto;

import io.mini.jejoTrip.domain.users.Users;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UsersDTO {

    private Long uno;

    private String userName; //사용자 e-mail

    private String password;

    private String realname; //실명

    private String nickname; //별명

    private String gender;

    private int age;


    /*DTO -> Entity*/
    public Users toEntity() {
        Users users = Users.builder()
                .userName(userName)
                .passWord(password)
                .realName(realname)
                .nickName(nickname)
                .gender(gender)
                .age(age)
                .build();
        return  users;
    }

}
