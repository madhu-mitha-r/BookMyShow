package org.projects.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Movie extends BaseModel{

    private String title;
    private String description;
    private double duration;
}
