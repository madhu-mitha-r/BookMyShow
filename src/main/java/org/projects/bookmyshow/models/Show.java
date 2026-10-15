package org.projects.bookmyshow.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity(name="shows")
public class Show extends BaseModel{

    @ManyToOne
    private Screen screen;

    private Date showDate;

    @Enumerated(EnumType.ORDINAL)
    private ShowStatus showStatus;

    @ManyToOne
    private Movie movie;

    @ManyToMany
    private List<SeatInShow> seatsInShow;

}
