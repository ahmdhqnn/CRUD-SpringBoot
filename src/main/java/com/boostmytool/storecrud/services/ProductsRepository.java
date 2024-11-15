package com.boostmytool.storecrud.services;

import org.springframework.data.jpa.repository.JpaRepository;
import com.boostmytool.storecrud.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
