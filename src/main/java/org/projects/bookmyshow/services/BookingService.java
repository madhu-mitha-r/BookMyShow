package org.projects.bookmyshow.services;

import java.util.List;

public interface BookingService {
    public void bookShow(long showId, List<Long> seatIds);
}
