package org.projects.bookmyshow.dtos;

import java.util.List;

public class BookingRequestDto {

    long userId;
    long showId;
    List<Long> showSeatIds;
}
