package com.galu.product.service;

import com.galu.product.model.request.ProductRequest;
import com.galu.product.model.response.ProductResponse;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import org.apache.coyote.BadRequestException;
import org.springframework.web.bind.annotation.PathVariable;

public interface ProductService {
    Completable save(ProductRequest request);
    Maybe<ProductResponse> getById(Long idProduct) throws BadRequestException;
    Observable<ProductResponse> getData();
}
