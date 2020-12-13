package com.sia.tacocloud.repository;

import com.sia.tacocloud.persistence.model.Ingredient;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();

    Ingredient findOne(String id);

    Ingredient save(Ingredient ingredient);

}
