package org.projects.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Booking extends  BaseModel{

    @OneToOne
    private Show show;

    @ManyToOne
    private User user;

    @OneToMany
    private List<SeatInShow> seatsBooked;

    private double price;

    @OneToMany
    private List<Payment> payment;

    @Enumerated(EnumType.ORDINAL)
    private BookingStatus bookingStatus;
}
