package com.purusottam.swiggyinstamart.repository;

import com.purusottam.swiggyinstamart.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
