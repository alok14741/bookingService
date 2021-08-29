package com.paypal.bfs.test.bookingserv.repository;

import com.paypal.bfs.test.bookingserv.domain.AddressEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends CrudRepository<AddressEntity,Integer> {
}
