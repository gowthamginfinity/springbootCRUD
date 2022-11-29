package com.example.SpringCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringCRUD.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);

}
