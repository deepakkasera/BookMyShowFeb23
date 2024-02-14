package com.scaler.bookmyshowfeb23.controllers;

import com.scaler.bookmyshowfeb23.dtos.BookMovieRequestDto;
import com.scaler.bookmyshowfeb23.dtos.BookMovieResponseDto;
import com.scaler.bookmyshowfeb23.services.BookingService;
import org.springframework.stereotype.Controller;

@Controller
public class BookingController {
    private BookingService bookingService;

    BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    public BookMovieResponseDto bookTicket(BookMovieRequestDto requestDto) {
        return null;
    }
}
