package com.management.book_system.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.management.book_system.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
