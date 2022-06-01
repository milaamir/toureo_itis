package ru.itis.toureo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.itis.toureo.models.City;
import ru.itis.toureo.models.Hotel;

import java.util.List;


@Repository
public interface HotelsRepository extends JpaRepository<Hotel, Long> {

    @Query(nativeQuery = true, value = "select * from hotel where city_id=?1")
    List<Hotel> findAllByCity(Long cityId);

    @Query(nativeQuery = true, value = "select * from hotel where stars=?1")
    List<Hotel> findAllByStars(Integer stars);


}
