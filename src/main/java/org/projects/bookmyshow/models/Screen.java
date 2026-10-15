package org.projects.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;


@Data
@Entity
public class Screen extends BaseModel{

    @ManyToOne
    private Theatre theatre;

    @OneToMany
    private List<Seat> seats;
}
