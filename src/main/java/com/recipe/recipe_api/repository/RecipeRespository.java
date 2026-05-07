package com.recipe.recipe_api.repository;

import com.recipe.recipe_api.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRespository extends JpaRepository <Recipe, Long> {
}
