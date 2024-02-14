package com.scaler.bookmyshowfeb23.services;

import com.scaler.bookmyshowfeb23.exceptions.ShowNotFoundException;
import com.scaler.bookmyshowfeb23.exceptions.UserNotFoundException;
import com.scaler.bookmyshowfeb23.models.Booking;
import com.scaler.bookmyshowfeb23.models.Show;
import com.scaler.bookmyshowfeb23.models.User;
import com.scaler.bookmyshowfeb23.repositories.ShowRepository;
import com.scaler.bookmyshowfeb23.repositories.UserRepository;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
    private UserRepository userRepository;
    private ShowRepository showRepository;

    BookingService(UserRepository userRepository, ShowRepository showRepository) {
        this.userRepository = userRepository;
        this.showRepository = showRepository;
    }

    public Booking bookTicket(Long userId, Long showId, List<Long> showSeatIds) throws UserNotFoundException, ShowNotFoundException {

        Optional<User> optionalUser = userRepository.findById(userId);
        if (optionalUser.isEmpty()) {
            throw new UserNotFoundException("Invalid userId");
        }
        User user = optionalUser.get();

        Optional<Show> optionalShow = showRepository.findById(showId);
        if (optionalShow.isEmpty()) {
            throw new ShowNotFoundException("Invalid Show");
        }
        Show show = optionalShow.get();


        return null;
    }
}
