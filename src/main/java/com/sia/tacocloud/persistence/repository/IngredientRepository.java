package com.sia.tacocloud.persistence.repository;

import com.sia.tacocloud.persistence.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

/**
 * @author lykis
 */
public interface IngredientRepository extends CrudRepository<Ingredient, String> {
    Iterable<Ingredient> findAll();

    Ingredient save(Ingredient ingredient);
}
