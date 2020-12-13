package com.sia.tacocloud.persistence.repository;

import com.sia.tacocloud.persistence.model.Ingredient;
import com.sia.tacocloud.persistence.model.Taco;
import org.springframework.data.repository.CrudRepository;

/**
 * @author lykis
 */
public interface TacoRepository extends CrudRepository<Taco, Long> {
    Taco save(Taco design);
}
