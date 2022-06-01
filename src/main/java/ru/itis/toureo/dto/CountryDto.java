package ru.itis.toureo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.toureo.models.Country;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CountryDto {
    private Long id;
    private String name;

    public static CountryDto from (Country country) {
        return CountryDto.builder()
                .id(country.getId())
                .name(country.getName())
                .build();
    }

    public static List<CountryDto> from(List<Country> countries) {
        return countries
                .stream()
                .map(CountryDto::from)
                .collect(Collectors.toList());
    }

}
