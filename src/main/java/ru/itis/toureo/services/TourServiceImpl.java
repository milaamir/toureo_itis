package ru.itis.toureo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.itis.toureo.dto.TourDto;
import ru.itis.toureo.models.Tour;
import ru.itis.toureo.models.User;
import ru.itis.toureo.repositories.ToursRepository;
import ru.itis.toureo.repositories.UsersRepository;


import java.util.List;

@Service
public class TourServiceImpl implements TourService {

    @Autowired
    private UsersRepository userRepository;

    @Autowired
    private ToursRepository tourRepository;
    private TourDto tourDto;

    @Override
    public Tour saveTour(TourDto tourDto) {
        this.tourDto = tourDto;
        return tourRepository.save(Tour.builder()
                .name(tourDto.getName())
                .build());
    }


    @Override
    public List<Tour> getALlTours() {
        return tourRepository.findAll();
    }

    @Override
    public List<Tour> getALlToursByUserId(long userId) {

        User user = userRepository.findById(userId).
                orElseThrow(() -> new UsernameNotFoundException("User not found"));
        return user.getTours();
    }

    @Override
    public void addTourToUser(Long userId, Long tourId) {
        Tour tour = tourRepository.findById(tourId).orElseThrow(() -> new IllegalArgumentException("Tour not found"));
        User user = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));
        if (!user.getTours().contains(tour)) {
            user.getTours().add(tour);
        } else {
            throw new IllegalArgumentException("Tour is exist");
        }
    }

    @Override
    public void deleteTourFromUser(Long userId, Long tourId) {
        Tour tour = tourRepository.findById(tourId).orElseThrow(() -> new IllegalArgumentException("Tour not found"));
        User user = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));
        if (user.getTours().contains(tour)) {
            user.getTours().remove(tour);
        } else {
            throw new IllegalArgumentException("Tour isn't exist");
        }
    }
}
