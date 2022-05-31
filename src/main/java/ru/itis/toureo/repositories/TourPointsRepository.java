package ru.itis.toureo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.toureo.models.City;
import ru.itis.toureo.models.Tour_point;


@Repository
public interface TourPointsRepository extends JpaRepository<Tour_point, Long> {

}
