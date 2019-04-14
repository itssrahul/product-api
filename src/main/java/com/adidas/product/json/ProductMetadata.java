package com.adidas.product.json;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;


@Data
public class ProductMetadata implements Serializable {


    private String page_title;

    private String site_name;

    private String description;

    private String keywords;

    private String canonical;

}
