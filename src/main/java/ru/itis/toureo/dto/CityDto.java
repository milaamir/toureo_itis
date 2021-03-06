package ru.itis.toureo.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.toureo.models.City;
import ru.itis.toureo.models.Country;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CityDto {
    private Long id;
    private String name;
    private Country country;

    public static CityDto from(City city) {
        return CityDto.builder()
                .id(city.getId())
                .name(city.getName())
                .country(city.getCountry())
                .build();
    }

    public static List<CityDto> from(List<City> cities) {
        return cities
                .stream()
                .map(CityDto::from)
                .collect(Collectors.toList());
    }
}


