package lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Dasha on 9/16/2016.
 */
public class ExcessiveLambdas {

    private List<Recipe> recipeList;

    public ExcessiveLambdas(List<Recipe> recipeList) {
        this.recipeList = recipeList;
    }

    public void getApplicableRecipes(Predicate<Recipe> recipePredicate, Consumer<Recipe> block){
        for(Recipe r : recipeList){
            if(recipePredicate.test(r)) block.accept(r);
        }
    }

    public void getModifiedApplicableRecipes(Predicate<Recipe> recipePredicate, Function<Recipe, String> function, Consumer<String> consumer){
        for(Recipe r :recipeList){
            if(recipePredicate.test(r)){
                consumer.accept(function.apply(r));
            }
        }
    }
}
