package lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dasha on 9/16/2016.
 */
public class LambdasWithNamedInterface {
    public static interface RecipeApplicabilityChecker{
        boolean applicable(Recipe r);
    }

    private List<Recipe> recipeList;

    public LambdasWithNamedInterface() {
        recipeList = new ArrayList<>();
    }

    public LambdasWithNamedInterface(List<Recipe> recipeList) {
        this.recipeList = recipeList;
    }

    public List<Recipe> getApplicableRecipes(RecipeApplicabilityChecker c){
        List<Recipe> result = new ArrayList<>();
        for(Recipe r : recipeList){
            if(c.applicable(r)) result.add(r);
        }
        return result;
    }

}
