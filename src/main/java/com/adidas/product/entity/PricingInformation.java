package com.adidas.product.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@Entity
@Table(name = "PRICING_INFORMATION")
public class PricingInformation implements Serializable {

    @Id
    @Column(name = "p_id")
    @Size(max = 6)
    private String pId;

    @Column(length = 10, precision = 2)
    private Double standardPrice;

    @Column(length = 10, precision = 2)
    private Double standardPriceNoVat;

    @Column(length = 10, precision = 2)
    private Double currentPrice;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @PrimaryKeyJoinColumn( name="p_id", referencedColumnName="p_id")
    private Product product;


}
