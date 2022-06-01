package ru.itis.toureo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.toureo.dto.CityDto;
import ru.itis.toureo.repositories.CitiesRepository;

import java.util.List;

import static ru.itis.toureo.dto.CityDto.from;

@Service
public class CityServiceImpl implements CityService{
    @Autowired
    private final CitiesRepository citiesRepository;

    public CityServiceImpl(CitiesRepository citiesRepository) {
        this.citiesRepository = citiesRepository;
    }


    @Override
    public List<CityDto> getAll() {
        return from(citiesRepository.findAll());
    }


}
