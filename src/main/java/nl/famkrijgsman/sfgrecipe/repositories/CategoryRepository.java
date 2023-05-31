package nl.famkrijgsman.sfgrecipe.repositories;

import nl.famkrijgsman.sfgrecipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
