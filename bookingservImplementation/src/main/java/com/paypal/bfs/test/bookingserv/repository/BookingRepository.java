package com.paypal.bfs.test.bookingserv.repository;

import com.paypal.bfs.test.bookingserv.domain.BookingEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends CrudRepository<BookingEntity, Integer> {
}
