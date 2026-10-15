package org.projects.bookmyshow.services.impl;

import org.projects.bookmyshow.services.BookingService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Override
    public void bookShow(long showId, List<Long> seatIds) {

    }
}
