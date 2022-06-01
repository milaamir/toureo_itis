package ru.itis.toureo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.toureo.models.Role;
import ru.itis.toureo.models.Tour;
import ru.itis.toureo.models.User;
import ru.itis.toureo.models.User_tour;

import javax.persistence.*;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SignInDto {
    private String login;
    private String password;

    public static UserDto from(User user) {
        return UserDto.builder()
                .login(user.getLogin())
                .password(user.getPassword())
                .build();
    }

}
