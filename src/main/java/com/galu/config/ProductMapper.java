package com.galu.config;

import com.galu.product.model.entity.ProductEntity;
import com.galu.product.model.request.ProductRequest;
import com.galu.product.model.response.ProductResponse;
import lombok.Data;

@Data
public class ProductMapper {
    public ProductEntity toSave (ProductRequest request){
        ProductEntity model = new ProductEntity();
        model.setName(request.getName());
        model.setDescription(request.getDescription());
        return model;
    }

    public ProductResponse toResponse (ProductEntity entity){
        ProductResponse response = new ProductResponse();
        response.setName(entity.getName());
        response.setDescription(entity.getDescription());
        return response;
    }
}
