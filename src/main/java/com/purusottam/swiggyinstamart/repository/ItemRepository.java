package com.purusottam.swiggyinstamart.repository;

import com.purusottam.swiggyinstamart.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
