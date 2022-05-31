package ru.itis.toureo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.toureo.models.City;


@Repository
public interface CitiesRepository extends JpaRepository<City, Long> {

}
