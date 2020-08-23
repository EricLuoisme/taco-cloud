package com.sia.tacocloud.persistence.repository;

import com.sia.tacocloud.persistence.model.Ingredient;
import com.sia.tacocloud.persistence.model.Order;

/**
 * @author lykis
 */
public interface OrderRepository {
    Order save(Order order);
}
