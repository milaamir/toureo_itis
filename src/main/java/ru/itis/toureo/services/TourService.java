package ru.itis.toureo.services;


import ru.itis.toureo.dto.TourDto;
import ru.itis.toureo.models.Tour;

import java.util.List;

public interface TourService {

    Tour saveTour(TourDto tourDto);
    List<Tour> getALlTours();
    List<Tour> getALlToursByUserId(long userId);
    void addTourToUser(Long userId, Long tourId);
    void deleteTourFromUser(Long userId, Long tourId);
}
