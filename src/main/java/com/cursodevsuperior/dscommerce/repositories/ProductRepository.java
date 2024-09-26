package com.cursodevsuperior.dscommerce.repositories;

import com.cursodevsuperior.dscommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
