package com.sia.tacocloud.persistence.repository;

import com.sia.tacocloud.persistence.model.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author lykis
 */
public interface OrderRepository extends CrudRepository<Order, Long> {

    Order save(Order order);

}
