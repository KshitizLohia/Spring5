package guru.springframework.recipeapp.service;

import guru.springframework.recipeapp.models.Recipe;

import java.util.Set;

public interface RecipeService {
    public Set<Recipe> getRecipes();
}
