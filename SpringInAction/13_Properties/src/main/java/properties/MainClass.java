package properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Dasha on 5/12/2016.
 */
public class MainClass {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Product product = (Product) context.getBean(Product.class);
        System.out.println(product.description());

        Recipe recipe = (Recipe) context.getBean(Recipe.class);
        System.out.println(recipe.description());
    }
}
