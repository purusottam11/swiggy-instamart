package com.purusottam.swiggyinstamart.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cart_summery_tb")
@Builder
public class CartSummery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartSummeryId;
    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(
            name = "cart_id",
            referencedColumnName = "cartId"
    )
    private Cart cart;

    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            optional = false
    )
    @JoinColumn(
            name = "item_id",
            referencedColumnName = "itemId"
    )
    private Item item;
    private Integer count;
    private Double price;
}
