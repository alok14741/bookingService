package com.paypal.bfs.test.bookingserv.converter;

import com.paypal.bfs.test.bookingserv.api.model.Address;
import com.paypal.bfs.test.bookingserv.api.model.Booking;
import com.paypal.bfs.test.bookingserv.domain.AddressEntity;
import com.paypal.bfs.test.bookingserv.domain.BookingEntity;
import com.paypal.bfs.test.bookingserv.util.DateConverterUtil;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Optional;

public class BookingConverter {

    public static Booking convertToBooking(BookingEntity bookingEntity) {
        Booking booking = new Booking();
        booking.setId(bookingEntity.getId());
        booking.setFirstName(bookingEntity.getFirstName());
        booking.setLastName(bookingEntity.getLastName());
        booking.setCheckInDateTime(bookingEntity.getCheckInTime());
        booking.setCheckOutDateTime(bookingEntity.getCheckOutTime());
        booking.setDateOfBirth(DateConverterUtil.convertDate(bookingEntity.getDateOfBirth()));
        booking.setDeposit(bookingEntity.getDeposit().doubleValue());
        booking.setTotalPrize(bookingEntity.getTotalPrice().doubleValue());
        Address address = new Address();
        Optional.ofNullable(bookingEntity.getAddressEntity()).ifPresent(savedAddress -> {
            address.setLine1(savedAddress.getLine1());
            address.setLine2(savedAddress.getLine2());
            address.setCity(savedAddress.getCity());
            address.setState(savedAddress.getState());
            address.setZipcode(savedAddress.getZipCode());
        });
        booking.setAddress(address);
        return booking;
    }

    public static BookingEntity convertToEntity(Booking booking) throws ParseException {
        BookingEntity bookingEntity = new BookingEntity();
        bookingEntity.setFirstName(booking.getFirstName());
        bookingEntity.setLastName(booking.getLastName());
        bookingEntity.setCheckInTime(booking.getCheckInDateTime());
        bookingEntity.setCheckOutTime(booking.getCheckOutDateTime());
        bookingEntity.setDateOfBirth(DateConverterUtil.convertToDate(booking.getDateOfBirth()));
        bookingEntity.setDeposit(new BigDecimal(booking.getDeposit()));
        bookingEntity.setTotalPrice(new BigDecimal(booking.getTotalPrize()));
        AddressEntity addressEntity = new AddressEntity();
        Optional.ofNullable(booking.getAddress()).ifPresent(address -> {
            addressEntity.setLine1(address.getLine1());
            addressEntity.setLine2(address.getLine2());
            addressEntity.setCity(address.getCity());
            addressEntity.setState(address.getState());
            addressEntity.setZipCode(address.getZipcode());
        });
        bookingEntity.setAddressEntity(addressEntity);
        return bookingEntity;
    }

}
