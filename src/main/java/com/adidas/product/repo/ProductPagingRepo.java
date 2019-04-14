package com.adidas.product.repo;

import com.adidas.product.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface ProductPagingRepo extends PagingAndSortingRepository <Product, String>{

    @Query("Select p from  Product p "
            + "where p.id in  (:pIdList) ")
    Page<Product> findById(@Param("pIdList") List<String> pIdList, Pageable pageable);
}
