package com.cursodevsuperior.dscommerce.repositories;

import com.cursodevsuperior.dscommerce.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
