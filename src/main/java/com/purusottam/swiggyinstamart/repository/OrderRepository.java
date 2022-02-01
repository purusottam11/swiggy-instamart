package com.purusottam.swiggyinstamart.repository;

import com.purusottam.swiggyinstamart.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
