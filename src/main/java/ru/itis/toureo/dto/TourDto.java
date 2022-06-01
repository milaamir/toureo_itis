package ru.itis.toureo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.toureo.models.Photo;
import ru.itis.toureo.models.Tour;
import ru.itis.toureo.models.Tour_point;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TourDto {
    private Long id;
    private String name;
    private String description;
    private Photo photo;
    private Date date;
    private List<Tour_point> tour_point;

    public static TourDto from(Tour tour) {
        return TourDto.builder()
                .id(tour.getId())
                .name(tour.getName())
                .description(tour.getDescription())
                .photo(tour.getPhoto())
                .date(tour.getDate())
                .tour_point(tour.getTour_point())
                .build();
    }

    public static List<TourDto> from(List<Tour> tours){
        return tours.stream()
                .map(TourDto::from)
                .collect(Collectors.toList());
    }
}
