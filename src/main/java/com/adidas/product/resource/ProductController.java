package com.adidas.product.resource;

import com.adidas.product.json.Product;
import com.adidas.product.service.ProductService;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;

import javax.jms.Queue;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("product")
public class ProductController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JmsTemplate jmsTemplate;

    @Autowired
    private ProductService productService;

    @Autowired
    private Queue queue;

    @PostMapping("/publish")
    public String publishString(@RequestBody Product product){

        if(product.getId().length() > 6){
            return "Can't Publish, Invalid product Id. Max Allowed length is 6";
        }

        if(product.getModel_number().length() > 6){
            return "Can't Publish, Invalid Model Number. Max Allowed length is 6";
        }

        if(product.getMeta_data() == null){
            return "Can't Publish, Please provide Metadata";
        }

        if(product.getPricing_information() == null){
            return "Can't Publish, Please provide Pricing";
        }

        if(product.getProduct_description() == null){
            return "Can't Publish, Please provide Product Desc";
        }

        logger.info("payload : " + product);

        jmsTemplate.convertAndSend(queue, product);
        return "published successfully";
    }

    @GetMapping(name = "/getProductsById")
    public List<Product> getProductsByIds(@RequestParam("page") int page,
                                          @RequestParam("size") int size,
                                          @ApiParam(name="ids", value="Provide comma(,) separated Product Ids") @RequestParam("ids") String ids){
        Page<com.adidas.product.entity.Product> productPage =  productService.getProductByIds(ids,new PageRequest(page,size));

        return productPage.getContent().stream().map(p -> p.getProductJson(p)).collect(Collectors.toList());
    }
}
