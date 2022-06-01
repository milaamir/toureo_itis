package ru.itis.toureo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.itis.toureo.dto.HotelDto;
import ru.itis.toureo.models.City;
import ru.itis.toureo.repositories.HotelsRepository;

import java.util.List;

import static ru.itis.toureo.dto.HotelDto.from;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private final HotelsRepository hotelsRepository;

    public HotelServiceImpl(HotelsRepository hotelsRepository) {
        this.hotelsRepository = hotelsRepository;
    }

    @Override
    public List<HotelDto> getAll() {
        return from(hotelsRepository.findAll());
    }

    @Override
    public List<HotelDto> getAllByCity(City city) {
        return from(hotelsRepository.findAllByCity(city.getId()));
    }

    @Override
    public List<HotelDto> getAllByStars(Integer stars) {
        return from(hotelsRepository.findAllByStars(stars));
    }

}
