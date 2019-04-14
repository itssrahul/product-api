package com.adidas.product.service;

import com.adidas.product.json.PricingInformation;
import com.adidas.product.json.Product;
import com.adidas.product.json.ProductDescription;
import com.adidas.product.json.ProductMetadata;
import com.adidas.product.repo.ProductPagingRepo;
import com.adidas.product.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;



@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductPagingRepo productPagingRepo;


    public void saveOrUpdateProduct(Product prodPayload){

        Optional<com.adidas.product.entity.Product> opProduct = productRepository.findById(prodPayload.getId());

        com.adidas.product.entity.Product product;
        if(!opProduct.isPresent()){
            product = new com.adidas.product.entity.Product();
        } else{
            product = opProduct.get();
        }
        populateProduct(product,prodPayload);

        productRepository.save(product);

    }

    private void populateProduct(com.adidas.product.entity.Product product, Product prodPayload) {

        product.setId(prodPayload.getId());
        product.setName(prodPayload.getName());
        product.setModelNumber(prodPayload.getModel_number());
        product.setProductType(prodPayload.getProduct_type());

        populateProductMetadata(product, prodPayload.getMeta_data());
        populateProductPrice(product, prodPayload.getPricing_information());
        populateProductDesc(product, prodPayload.getProduct_description());

    }

    private void populateProductDesc(com.adidas.product.entity.Product product, ProductDescription payload_productDesc) {

        if(product.getProductDescription() == null){
            product.setProductDescription(new com.adidas.product.entity.ProductDescription());
        }
        product.getProductDescription().setPId(product.getId());
        product.getProductDescription().setTitle(payload_productDesc.getTitle());
        product.getProductDescription().setSubtitle(payload_productDesc.getSubtitle());
        product.getProductDescription().setText(payload_productDesc.getText());
    }

    private void populateProductPrice(com.adidas.product.entity.Product product, PricingInformation payload_price) {

        if(product.getPricingInformation() == null){
            product.setPricingInformation(new com.adidas.product.entity.PricingInformation());
        }
        product.getPricingInformation().setPId(product.getId());
        product.getPricingInformation().setStandardPrice(payload_price.getStandard_price());
        product.getPricingInformation().setStandardPriceNoVat(payload_price.getStandard_price_no_vat());
        product.getPricingInformation().setCurrentPrice(payload_price.getCurrentPrice());

    }

    private void populateProductMetadata(com.adidas.product.entity.Product product, ProductMetadata payloadMeta_data) {

        if(product.getMetaData() == null){
            product.setMetaData(new com.adidas.product.entity.ProductMetadata());
        }
        product.getMetaData().setPId(product.getId());
        product.getMetaData().setPageTitle(payloadMeta_data.getPage_title());
        product.getMetaData().setSiteName(payloadMeta_data.getSite_name());
        product.getMetaData().setDescription(payloadMeta_data.getDescription());
        product.getMetaData().setKeywords(payloadMeta_data.getKeywords());
        product.getMetaData().setCanonical(payloadMeta_data.getCanonical());

    }

    public Page<com.adidas.product.entity.Product> getProductByIds(String Ids ,Pageable pageable) {

        List<String> idList = Arrays.asList(Ids.split(","));
        return productPagingRepo.findById(idList, pageable);
    }

}
