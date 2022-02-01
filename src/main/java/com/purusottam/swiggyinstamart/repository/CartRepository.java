package com.purusottam.swiggyinstamart.repository;

import com.purusottam.swiggyinstamart.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {
}
