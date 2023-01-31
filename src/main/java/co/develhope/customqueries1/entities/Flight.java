package co.develhope.customqueries1.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long id;


    private String description;
    private String fromAirport;
    private String toAirport;

    @Enumerated(EnumType.STRING)
    private FlightStatus status;

    public Flight(){}
}