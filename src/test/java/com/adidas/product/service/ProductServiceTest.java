package com.adidas.product.service;

import com.adidas.product.entity.PricingInformation;
import com.adidas.product.entity.Product;
import com.adidas.product.entity.ProductDescription;
import com.adidas.product.entity.ProductMetadata;
import com.adidas.product.repo.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ProductServiceTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private ProductRepository productRepository;

    @Test
    public void testPayloadPersistence(){
        Product p = new Product();
        p.setId("df456");
        p.setModelNumber("ty452");
        p.setName("Shoes");
        p.setProductType("inline");
        ProductMetadata md = new ProductMetadata();
        md.setPId("df456");
        md.setPageTitle("");
        md.setSiteName("");
        md.setDescription("");
        md.setKeywords("");
        md.setCanonical("");

        PricingInformation price = new PricingInformation();
        price.setPId("df456");
        price.setStandardPrice(12.2);
        price.setStandardPriceNoVat(12.3);
        price.setCurrentPrice(12.5);

        ProductDescription desc = new ProductDescription();
        desc.setPId("df456");
        desc.setTitle("");
        desc.setSubtitle("");
        desc.setText("");
        p.setMetaData(md);
        p.setPricingInformation(price);
        p.setProductDescription(desc);

        entityManager.persist(p);
        entityManager.flush();

        Product p1 = productRepository.findById("df456").get();

        assertThat(p1.getName()).isEqualTo(p.getName());

    }
}
