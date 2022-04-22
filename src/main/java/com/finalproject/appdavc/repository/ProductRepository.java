package com.finalproject.appdavc.repository;

import com.finalproject.appdavc.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
