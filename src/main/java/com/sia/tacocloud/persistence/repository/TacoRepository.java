package com.sia.tacocloud.persistence.repository;

import com.sia.tacocloud.persistence.model.Ingredient;
import com.sia.tacocloud.persistence.model.Taco;

/**
 * @author lykis
 */
public interface TacoRepository {
    Taco save(Taco design);
}
