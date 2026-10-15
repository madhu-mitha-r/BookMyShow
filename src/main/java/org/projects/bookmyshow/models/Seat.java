package org.projects.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Seat extends BaseModel{
    private int rowValue;
    private int columnValue;

    @ManyToOne
    private SeatType seatType;

}
