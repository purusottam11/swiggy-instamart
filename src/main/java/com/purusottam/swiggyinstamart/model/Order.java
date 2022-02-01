package com.purusottam.swiggyinstamart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_tb")
public class Order {

    public enum OrderStatus {
        PLACED,
        FAILED
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long orderId;
    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(
            name = "customer_id",
            referencedColumnName = "customerId"
    )
    private Customer customer;
    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(
            name = "cart_id",
            referencedColumnName = "cartId"
    )
    private Cart cart;
    private Instant timestamp;
    private String paymentId;
    private OrderStatus orderStatus;

}
