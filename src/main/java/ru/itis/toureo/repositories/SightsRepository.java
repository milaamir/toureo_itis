package ru.itis.toureo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.toureo.models.City;
import ru.itis.toureo.models.Sight;


@Repository
public interface SightsRepository extends JpaRepository<Sight, Long> {

}
