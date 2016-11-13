package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Dasha on 9/16/2016.
 */
public class LambdasWithStandardFunctionalInterface {
    private List<Recipe> recipeList;

    public LambdasWithStandardFunctionalInterface(List<Recipe> recipeList) {
        this.recipeList = recipeList;
    }

    public List<Recipe> getApplicableRecipes(Predicate<Recipe> recipePredicate){
        List<Recipe> results = new ArrayList<>();
        for(Recipe r : recipeList){
            if(recipePredicate.test(r)) results.add(r);
        }
        return results;
    }
}
