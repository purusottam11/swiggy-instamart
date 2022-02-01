package com.purusottam.swiggyinstamart.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "customer_tb")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    @Column(nullable = false)
    private String firstName;
    private String lastName;
    @Column(nullable = false)
    private String emailId;
    @Column(nullable = false)
    private String phoneNumber;
    private String password;
    private String imageUrl;
    @OneToMany(targetEntity = Address.class, cascade = CascadeType.ALL)
    private List<Address> addresses;

}
