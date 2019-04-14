package com.adidas.product.json;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
public class ProductDescription implements Serializable {

    private String title;

    private String subtitle;

    private String text;



}
