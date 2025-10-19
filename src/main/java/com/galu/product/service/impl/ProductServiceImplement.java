package com.galu.product.service.impl;

import com.galu.product.model.request.ProductRequest;
import com.galu.product.model.response.ProductResponse;
import com.galu.product.repository.ProductRepository;
import com.galu.product.service.ProductService;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImplement implements ProductService {
    @Autowired
    ProductRepository repository;

    @Override
    public Completable save(ProductRequest request) {
        return null;
    }

    @Override
    public Maybe<ProductResponse> getById(Long idProduct) {
        return null;
    }

    @Override
    public Observable<ProductResponse> getData() {
        return null;
    }
}
