package lambdas;

import java.util.List;

/**
 * Created by Dasha on 9/16/2016.
 */
public class Recipe {
    String name;
    List<String> ingredients;
    Integer cookingTimeInMinutes;

    public Recipe(String name, List<String> ingredients, Integer cookingTimeInMinutes) {
        this.name = name;
        this.ingredients = ingredients;
        this.cookingTimeInMinutes = cookingTimeInMinutes;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public Integer getCookingTimeInMinutes() {
        return cookingTimeInMinutes;
    }
}
