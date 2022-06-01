package ru.itis.toureo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.itis.toureo.models.Photo;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PhotoDto {
    private Long id;
    private String path;

    public static PhotoDto from (Photo photo) {
        return PhotoDto.builder()
                .id(photo.getId())
                .path(photo.getPath())
                .build();
    }

    public static List<PhotoDto> from(List<Photo> photos) {
        return photos
                .stream()
                .map(PhotoDto::from)
                .collect(Collectors.toList());
    }

}
