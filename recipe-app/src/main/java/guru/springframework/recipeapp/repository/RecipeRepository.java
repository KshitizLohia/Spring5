package guru.springframework.recipeapp.repository;

import guru.springframework.recipeapp.models.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
