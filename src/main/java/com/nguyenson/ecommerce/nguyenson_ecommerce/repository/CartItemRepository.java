package com.nguyenson.ecommerce.nguyenson_ecommerce.repository;

import com.nguyenson.ecommerce.nguyenson_ecommerce.model.CartItem;
import com.nguyenson.ecommerce.nguyenson_ecommerce.model.Product;
import com.nguyenson.ecommerce.nguyenson_ecommerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    CartItem findByUserAndProduct(User user, Product product);

    void deleteByUserAndProduct(User user, Product product);

    List<CartItem> findByUser(User user);
}
