package org.acme.quickstart.entity;


import io.quarkus.hibernate.orm.panache.PanacheEntity;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.*;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity
public class Product extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "SEQ_PROD")
    @SequenceGenerator(name="SEQ_PROD", sequenceName = "SEQ_PROD", allocationSize = 1)
    @Column(name = "id")
    private Long id;
    @Column(name = "name_product")
    public String name;
    @Column(name = "sector_product")
    public String sector;
    @Column(name = "brand_product")
    public String brand;
    @Column(name = "price_product")
    public Double price;

    public Product() {
    }

    public Product(String name, String sector, String brand, Double price) {
        this.name = name;
        this.sector = sector;
        this.brand = brand;
        this.price = price;
    }
}
