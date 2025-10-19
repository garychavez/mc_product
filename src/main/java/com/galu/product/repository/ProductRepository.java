package com.galu.product.repository;

import com.galu.product.model.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Long> {

    @Query("from ProductEntity p where p.idProduct = :idProduct")
    ProductEntity searchById (@Param("idProduct") Long idProduct);
}
