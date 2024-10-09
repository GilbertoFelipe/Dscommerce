package com.cursodevsuperior.dscommerce.repositories;


import com.cursodevsuperior.dscommerce.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;



public interface OrderRepository extends JpaRepository<Order, Long> {
}

