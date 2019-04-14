package com.adidas.product.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;


@Data
@Entity
@Table(name = "product_metadata")
public class ProductMetadata implements Serializable {

    @Id
    @Column(name = "p_id")
    @Size(max = 6)
    private String pId;

    @Column
    private String pageTitle;

    @Column
    @Size(max = 100)
    private String siteName;

    @Column
    @Size(max = 255)
    private String description;

    @Column
    @Size(max = 100)
    private String keywords;

    @Column
    @Size(max = 100)
    private String canonical;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @PrimaryKeyJoinColumn( name="p_id", referencedColumnName="p_id")
    private Product product;
}
