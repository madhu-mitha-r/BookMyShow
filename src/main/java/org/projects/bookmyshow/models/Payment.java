package org.projects.bookmyshow.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Payment extends BaseModel {

    @OneToOne
    private Booking booking;

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;

    private double amount;
}
