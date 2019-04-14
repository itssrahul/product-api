package com.adidas.product.consumer;

import com.adidas.product.json.Product;
import com.adidas.product.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ProductService productService;

    @JmsListener(destination = "product.queue")
    public void listener(Product product){

        logger.info("payload received by JMS: " + product);

        productService.saveOrUpdateProduct(product);

    }


}
