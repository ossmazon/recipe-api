package com.recipe.recipe_api.repository;

import com.recipe.recipe_api.entity.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository <Ingredient, Long> {
}
