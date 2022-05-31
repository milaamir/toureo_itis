package ru.itis.toureo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tour_point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "country_id", referencedColumnName = "id")
    private Country country;
    @OneToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    private City city;
    @OneToOne
    @JoinColumn(name = "hotel_id", referencedColumnName = "id")
    private Hotel hotel;
    @OneToOne
    @JoinColumn(name = "sight_id", referencedColumnName = "id")
    private Sight sight;
    @OneToOne
    @JoinColumn(name = "transport_id", referencedColumnName = "id")
    private Transport transport;

}
