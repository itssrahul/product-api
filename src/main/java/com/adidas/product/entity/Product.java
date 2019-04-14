package com.adidas.product.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data

@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @Size(max = 6)
    @NotNull
    @Column(name = "p_id")
    private String id;

    @Column
    @Size(max = 30)
    @NotNull
    private String name;

    @Column(unique = true)
    @Size(max = 6)
    @NotNull
    private String modelNumber;

    @Column
    @NotNull
    @Size(max = 10)
    private String productType;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "product")
    @NotNull
    private ProductMetadata metaData;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "product")
    @NotNull
    private PricingInformation pricingInformation;

    @OneToOne(fetch = FetchType.LAZY,
            cascade =  CascadeType.ALL,
            mappedBy = "product")
    @NotNull
    private ProductDescription productDescription;

    public com.adidas.product.json.Product getProductJson(com.adidas.product.entity.Product productDTO){

        com.adidas.product.json.Product product = new com.adidas.product.json.Product();

        product.setId(productDTO.getId());
        product.setName(productDTO.getName());
        product.setModel_number(productDTO.getModelNumber());
        product.setProduct_type(productDTO.getProductType());

        com.adidas.product.json.ProductMetadata productMetadata = new com.adidas.product.json.ProductMetadata();
        productMetadata.setPage_title(productDTO.getMetaData().getPageTitle());
        productMetadata.setSite_name(productDTO.getMetaData().getSiteName());
        productMetadata.setDescription(productDTO.getMetaData().getDescription());
        productMetadata.setKeywords(productDTO.getMetaData().getKeywords());
        productMetadata.setCanonical(productDTO.getMetaData().getCanonical());
        product.setMeta_data(productMetadata);

        com.adidas.product.json.PricingInformation pricingInformation = new com.adidas.product.json.PricingInformation();
        pricingInformation.setStandard_price(productDTO.getPricingInformation().getStandardPrice());
        pricingInformation.setStandard_price_no_vat(productDTO.getPricingInformation().getStandardPriceNoVat());
        pricingInformation.setCurrentPrice(productDTO.getPricingInformation().getCurrentPrice());
        product.setPricing_information(pricingInformation);

        com.adidas.product.json.ProductDescription description = new com.adidas.product.json.ProductDescription();
        description.setTitle(productDTO.getProductDescription().getTitle());
        description.setSubtitle(productDTO.getProductDescription().getSubtitle());
        description.setText(productDTO.getProductDescription().getText());
        product.setProduct_description(description);

        return product;
    }

}
