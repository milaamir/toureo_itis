package ru.itis.toureo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.toureo.models.City;
import ru.itis.toureo.models.Sight;
import ru.itis.toureo.models.Status;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SightDto {
    private Long id;
    private String name;
    private City city;

    public static SightDto from(Sight sight) {
        return SightDto.builder()
                .id(sight.getId())
                .name(sight.getName())
                .city(sight.getCity())
                .build();
    }

    public static List<SightDto> from(List<Sight> sights){
        return sights.stream()
                .map(SightDto::from)
                .collect(Collectors.toList());
    }
}
