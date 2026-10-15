package org.projects.bookmyshow.controllers;

import org.projects.bookmyshow.dtos.BookingRequestDto;
import org.projects.bookmyshow.dtos.BookingResponseDto;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {

    public BookingResponseDto bookShow(BookingRequestDto bookingRequestDto) {

        BookingResponseDto response = new BookingResponseDto();
        try {

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return response;
    }
}
