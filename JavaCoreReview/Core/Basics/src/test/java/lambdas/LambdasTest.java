package lambdas;

import com.google.common.collect.Lists;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Dasha on 9/16/2016.
 */
public class LambdasTest {
    private List<Recipe> getRecipesForTest() {
        List<Recipe> recipeList = new ArrayList<>();
        recipeList.add(new Recipe("Mushrooms stew", Lists.newArrayList("Mushrooms", "Cottage cheese", "Aged Cheddar"), 20));
        recipeList.add(new Recipe("Lentils soup", Lists.newArrayList("Red Lentils", "Carrots", "Curry"), 30));
        recipeList.add(new Recipe("Oatmeal cookies", Lists.newArrayList("Oatmeal", "Butter", "Raisins"), 40));
        return recipeList;
    }

    @Test
    public void testLabmdasWithNamedInterface() {
        LambdasWithNamedInterface myRecipeBook = new LambdasWithNamedInterface(getRecipesForTest());
        List<Recipe> quickRecipes = myRecipeBook.getApplicableRecipes(p -> p.cookingTimeInMinutes <= 20);
        assertEquals("Mushrooms stew", quickRecipes.get(0).getName());
    }

    @Test
    public void testLambdasWithStandardFunctionalInterface() {
        LambdasWithStandardFunctionalInterface myRecipeBook = new LambdasWithStandardFunctionalInterface(getRecipesForTest());
        List<Recipe> butteryRecipes = myRecipeBook.getApplicableRecipes(p -> p.getIngredients().contains("Butter"));
        assertEquals("Oatmeal cookies", butteryRecipes.get(0).getName());
    }

    @Test
    public void testConsumer() {
        ExcessiveLambdas myRecipeBook = new ExcessiveLambdas(getRecipesForTest());
        List<Recipe> results = new ArrayList<>();
        myRecipeBook.getApplicableRecipes(p -> true, p -> results.add(p));
        assertEquals(3, results.size());
    }

    @Test
    public void testFunction() {
        ExcessiveLambdas myRecipeBook = new ExcessiveLambdas(getRecipesForTest());
        List<String> results = new ArrayList<>();
        myRecipeBook.getModifiedApplicableRecipes(p -> p.getCookingTimeInMinutes() < 30, p -> p.getName(), name -> results.add(name));
        assertEquals(Lists.newArrayList("Mushrooms stew"), results);
    }

    @Test
    public void testLambdasWithAggregateOperations() {
        List<Recipe> myRecipeBook = getRecipesForTest();
        List<String> namesOfLongRecipes = new ArrayList<>();
        myRecipeBook.stream()
                .filter(p -> p.getCookingTimeInMinutes() > 30)
                .map(p -> p.getName())
                .forEach(p -> namesOfLongRecipes.add(p));
        assertEquals(Lists.newArrayList("Oatmeal cookies"), namesOfLongRecipes);
    }

    @Test
    public void weirdMethodReferenceToArbitraryInstance(){
        String[] names = {"Yuki", "Eaton", "Dasha", "Kostya"};
        Arrays.sort(names, String::compareToIgnoreCase);
        String[] expectedResult =  {"Dasha", "Eaton", "Kostya", "Yuki"};
        assertArrayEquals(expectedResult, names);
    }
}
