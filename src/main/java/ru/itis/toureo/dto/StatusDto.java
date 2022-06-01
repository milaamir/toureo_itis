package ru.itis.toureo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.toureo.models.Status;
import ru.itis.toureo.models.Tour;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StatusDto {
    private Long id;
    private String name;

    public static StatusDto from(Status status) {
        return StatusDto.builder()
                .id(status.getId())
                .name(status.getName())
                .build();
    }

    public static List<StatusDto> from(List<Status> statuses){
        return statuses.stream()
                .map(StatusDto::from)
                .collect(Collectors.toList());
    }
}
