package ru.itis.toureo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.toureo.models.*;

import java.util.List;
import java.util.stream.Collectors;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TourPointDto {
    private Long id;
    private Country country;
    private City city;
    private Hotel hotel;
    private Sight sight;
    private Transport transport;
    private Tour tour;
    private User_tour user_tour;

    public static TourPointDto from(Tour_point tourPoint) {
        return TourPointDto.builder()
                .id(tourPoint.getId())
                .country(tourPoint.getCountry())
                .city(tourPoint.getCity())
                .hotel(tourPoint.getHotel())
                .sight(tourPoint.getSight())
                .transport(tourPoint.getTransport())
                .tour(tourPoint.getTour())
                .user_tour(tourPoint.getUser_tour())
                .build();
    }

    public static List<TourPointDto> from(List<Tour_point> tourPoints){
        return tourPoints.stream()
                .map(TourPointDto::from)
                .collect(Collectors.toList());
    }
}
