package com.galu.product.repository;

import com.galu.product.model.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {

    @Query("from Product p where p.idProduct = :idProduct")
    ProductEntity searchById (@Param("idProduct") Long idProduct);
}
