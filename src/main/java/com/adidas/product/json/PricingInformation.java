package com.adidas.product.json;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
public class PricingInformation implements Serializable {


    private double standard_price;

    private double standard_price_no_vat;

    private double currentPrice;



}
