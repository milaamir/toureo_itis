package ru.itis.toureo.services;

import ru.itis.toureo.dto.HotelDto;
import ru.itis.toureo.models.City;

import java.util.List;

public interface HotelService {
    List<HotelDto> getAll();

    List<HotelDto> getAllByCity(City city);

    List<HotelDto> getAllByStars(Integer stars);
}
