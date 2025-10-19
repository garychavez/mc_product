package com.galu.product.service.impl;

import com.galu.config.ProductMapper;
import com.galu.product.model.request.ProductRequest;
import com.galu.product.model.response.ProductResponse;
import com.galu.product.repository.ProductRepository;
import com.galu.product.service.ProductService;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImplement implements ProductService {
    @Autowired
    ProductRepository repository;
    ProductMapper mapper;

    @Override
    public Completable save(ProductRequest request) {
        return Single.fromCallable(()-> mapper.toSave(request))
                .map(repository::save)
                .toCompletable();
    }

    @Override
    public Maybe<ProductResponse> getById(Long idProduct) {
        return Maybe.just(
                repository.searchById(idProduct))
                .map(mapper::toResponse);
    }

    @Override
    public Observable<ProductResponse> getData() {
        return Observable.fromIterable(repository.findAll())
                .map(mapper::toResponse);
    }
}
