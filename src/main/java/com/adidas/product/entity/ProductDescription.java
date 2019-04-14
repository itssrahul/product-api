package com.adidas.product.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@Entity
@Table(name = "PRODUCT_DESCRIPTION")
public class ProductDescription implements Serializable {

    @Id
    @Column(name = "p_id")
    @Size(max = 6)
    private String pId;

    @Column
    @Size(max = 50)
    private String title;

    @Column
    @Size(max = 255)
    private String subtitle;

    @Column
    @Size(max = 255)
    private String text;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @PrimaryKeyJoinColumn( name="p_id", referencedColumnName="p_id")
    private Product product;


}
