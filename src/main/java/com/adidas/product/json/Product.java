package com.adidas.product.json;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
public class Product implements Serializable {


    private String id;


    private String name;


    private String model_number;


    private String product_type;


    private ProductMetadata meta_data;


    private PricingInformation pricing_information;


    private ProductDescription product_description;





}
