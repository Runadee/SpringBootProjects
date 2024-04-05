package com.developeredanur.repositories;

import com.developeredanur.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Override
    Optional<Product> findById(Integer integer);
}