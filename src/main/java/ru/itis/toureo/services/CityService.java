package ru.itis.toureo.services;

import ru.itis.toureo.dto.CityDto;
import ru.itis.toureo.dto.HotelDto;

import java.util.List;

public interface CityService {
    List<CityDto> getAll();

}
