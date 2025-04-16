package com.nguyenson.ecommerce.nguyenson_ecommerce.repository;

import com.nguyenson.ecommerce.nguyenson_ecommerce.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
