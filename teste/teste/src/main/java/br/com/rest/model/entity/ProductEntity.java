package br.com.rest.model.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name = "product")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProductEntity extends PanacheEntity {

    @Column(nullable = false)
    private String productName;
    @Column(nullable = false)
    private String brand;
    @Column(nullable = false)
    private String batch;
    @Column(nullable = false, unique = true)
    private String barCode;
    @Column(nullable = false)
    private BigDecimal price;
    @Column(nullable = false)
    private Long amount;

}
