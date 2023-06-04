package nl.famkrijgsman.sfgrecipe.controllers;

import lombok.extern.slf4j.Slf4j;
import nl.famkrijgsman.sfgrecipe.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","index"})
    public String getIndexPage(Model model){
        log.debug("Fetching recipes.");
        model.addAttribute("recipes", recipeService.getRecipes() );
        return "index";
    }
}
