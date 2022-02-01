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
@Table(name = "item_tb")
@Builder
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long itemId;
    @Column(nullable = false)
    private String itemName;
    @Column(nullable = false)
    private String imageUrl;
    @Column(nullable = false)
    private Double mrpPrice;
    private Double offeredPrice;
    private String description;
    private String brand;
    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "category_Id",
            referencedColumnName = "categoryId"
    )
    private Category category;
}
