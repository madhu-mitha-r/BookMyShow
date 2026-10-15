package org.projects.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class SeatInShow extends BaseModel{

    @OneToOne
    private Show show;

    @OneToOne
    private Seat seat;

    @Enumerated(EnumType.ORDINAL)
    private SeatInShowAvailability seatInShowAvailability;
}
