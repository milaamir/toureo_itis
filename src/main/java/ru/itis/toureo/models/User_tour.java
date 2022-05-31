package ru.itis.toureo.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User_tour {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "status_id")
    private Status status;

    @Temporal(TemporalType.DATE)
    private Date date;

    @OneToMany(mappedBy = "user_tour")
    private List<Tour_point> tour_point;

    @OneToOne
    private User user;



}
