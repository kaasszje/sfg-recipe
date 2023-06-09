package nl.famkrijgsman.sfgrecipe.services;

import nl.famkrijgsman.sfgrecipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();
    Recipe findById(Long id);
}
