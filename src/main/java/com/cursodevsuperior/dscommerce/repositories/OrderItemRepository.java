package com.cursodevsuperior.dscommerce.repositories;

import com.cursodevsuperior.dscommerce.entities.OrderItem;
import com.cursodevsuperior.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
