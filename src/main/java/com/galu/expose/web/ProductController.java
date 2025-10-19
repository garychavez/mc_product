package com.galu.expose.web;

import com.galu.product.model.request.ProductRequest;
import com.galu.product.model.response.ProductResponse;
import com.galu.product.service.ProductService;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping
    public Completable save(@RequestBody ProductRequest request){
        return productService.save(request);
    }

    @GetMapping
    public Maybe<ProductResponse> getById(@PathVariable("idProduct") Long idProduct){
       return productService.getById(idProduct);
    }

    @GetMapping
    public Observable<ProductResponse> getData(){
        return productService.getData();
    }
}
