package com.paypal.bfs.test.bookingserv.service;

import com.paypal.bfs.test.bookingserv.api.model.Booking;

import java.util.List;

public interface BookingService {
    /**
     *  Creates {@link com.paypal.bfs.test.bookingserv.domain.BookingEntity}
     *
     * @param booking schema object
     * @return booking
     */
    Booking create(Booking booking);

    /**
     * fetches all {@link com.paypal.bfs.test.bookingserv.domain.BookingEntity} and returns
     *
     * @return list of all the bookings
     */
    List<Booking> getAllBookings();
}
