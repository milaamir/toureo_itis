package ru.itis.toureo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.toureo.models.Status;
import ru.itis.toureo.models.Tour_point;
import ru.itis.toureo.models.User;
import ru.itis.toureo.models.User_tour;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserTourDto {
    private Long id;
    private Status status;
    private Date date;
    private List<Tour_point> tour_point;
    private User user;

    public static UserTourDto from(User_tour userTours){
        return UserTourDto.builder()
                .id(userTours.getId())
                .status(userTours.getStatus())
                .date(userTours.getDate())
                .tour_point(userTours.getTour_point())
                .user(userTours.getUser())
                .build();
    }

    public static List<UserTourDto> from(List<User_tour> userTours){
        return userTours.stream()
                .map(UserTourDto::from)
                .collect(Collectors.toList());
    }
}
