package placeholders;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Dasha on 5/13/2016.
 */
public class MainClass {
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        Product product = applicationContext.getBean(Product.class);
        System.out.println(product.description());
    }
}
