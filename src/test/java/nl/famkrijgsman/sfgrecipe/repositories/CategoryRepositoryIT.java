package nl.famkrijgsman.sfgrecipe.repositories;

import nl.famkrijgsman.sfgrecipe.domain.Category;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@DataJpaTest
class CategoryRepositoryIT {

    @Autowired
    CategoryRepository categoryRepository;
    @BeforeEach
    void setUp() {
    }

    @Test
    void findByDescriptionMex() {
        Optional<Category> categoryOptional = categoryRepository.findByDescription("Mexican");

        assertEquals("Mexican", categoryOptional.get().getDescription());
    }

    @Test
    void findByDescriptionAm() {
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");

        assertEquals("American", categoryOptional.get().getDescription());
    }
}