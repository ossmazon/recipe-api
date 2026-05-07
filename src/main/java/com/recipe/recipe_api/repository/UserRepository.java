package com.recipe.recipe_api.repository;

import com.recipe.recipe_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
