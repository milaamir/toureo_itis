package ru.itis.toureo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.toureo.models.City;
import ru.itis.toureo.models.Hotel;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HotelDto {
    private Long id;

    private String name;
    private Integer stars;
    private City city;

    public static HotelDto from (Hotel hotel) {
        return HotelDto.builder().
                id(hotel.getId())
                .name(hotel.getName())
                .city(hotel.getCity())
                .stars(hotel.getStars())
                .build();
    }

    public static List<HotelDto> from(List<Hotel> hotels) {
        return hotels
                .stream()
                .map(HotelDto::from)
                .collect(Collectors.toList());
    }

}
