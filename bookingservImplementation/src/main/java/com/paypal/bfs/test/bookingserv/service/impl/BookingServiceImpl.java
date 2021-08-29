package com.paypal.bfs.test.bookingserv.service.impl;

import com.paypal.bfs.test.bookingserv.api.model.Booking;
import com.paypal.bfs.test.bookingserv.converter.BookingConverter;
import com.paypal.bfs.test.bookingserv.domain.BookingEntity;
import com.paypal.bfs.test.bookingserv.exceptionhandler.BookingSerException;
import com.paypal.bfs.test.bookingserv.repository.BookingRepository;
import com.paypal.bfs.test.bookingserv.service.BookingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookingServiceImpl implements BookingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BookingServiceImpl.class);

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public Booking create(Booking booking) {
        try {
            return Optional.of(
                    bookingRepository.save(BookingConverter.convertToEntity(booking)))
                    .map(BookingConverter::convertToBooking)
                    .orElseThrow(() -> new RuntimeException("Cannot save entity"));
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage());
            throw new BookingSerException(ex.getMessage());
        }
    }

    @Override
    public List<Booking> getAllBookings() {
        try {
            List<BookingEntity> list = (List<BookingEntity>) bookingRepository.findAll();
            List<Booking> listOfBooking = list.stream().map(
                    bookingEntity -> BookingConverter.convertToBooking(bookingEntity))
                    .collect(Collectors.toList());
            return listOfBooking;
        } catch (Exception ex) {
            LOGGER.error(ex.getMessage());
            throw new BookingSerException(ex.getMessage());
        }
    }
}
