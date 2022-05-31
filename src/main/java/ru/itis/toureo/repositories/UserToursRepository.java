package ru.itis.toureo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.itis.toureo.models.City;
import ru.itis.toureo.models.User_tour;


@Repository
public interface UserToursRepository extends JpaRepository<User_tour, Long> {

}
