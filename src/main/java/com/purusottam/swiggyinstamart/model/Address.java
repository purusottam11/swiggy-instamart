package com.purusottam.swiggyinstamart.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "address_tb")
@Builder
public class Address {
    public enum AddressType {
        DEFAULT,
        SECONDARY
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;
    @Column(nullable = false)
    private String addressName; // home office etc
    private String city;
    @Column(nullable = false)
    private BigDecimal longitude;
    @Column(nullable = false)
    private BigDecimal latitude;
    private AddressType addressType;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "customer_id",
            referencedColumnName = "customerId"
    )
    private Customer customer;

}
