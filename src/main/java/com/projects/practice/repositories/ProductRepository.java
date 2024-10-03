package com.projects.practice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.projects.practice.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
