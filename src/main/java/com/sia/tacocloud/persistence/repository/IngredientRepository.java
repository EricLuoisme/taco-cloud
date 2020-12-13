package com.sia.tacocloud.persistence.repository;

import com.sia.tacocloud.persistence.model.Ingredient;

/**
 * @author lykis
 */
public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);
}
