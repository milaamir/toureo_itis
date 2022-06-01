package ru.itis.toureo.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.toureo.models.Transport;
import ru.itis.toureo.models.User;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TransportDto {
    private Long id;
    private String name;

    public static TransportDto from(Transport transport) {
        return TransportDto.builder()
                .id(transport.getId())
                .name(transport.getName())
                .build();
    }
    public static List<TransportDto> from(List<Transport> transports){
        return transports.stream()
                .map(TransportDto::from)
                .collect(Collectors.toList());
    }
}
