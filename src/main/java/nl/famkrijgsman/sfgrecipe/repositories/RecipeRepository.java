package nl.famkrijgsman.sfgrecipe.repositories;

import nl.famkrijgsman.sfgrecipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
