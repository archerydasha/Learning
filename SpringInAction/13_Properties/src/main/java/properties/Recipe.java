package properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 5/13/2016.
 */
@Component
@PropertySource("classpath:product.properties")
public class Recipe {
    String name;
//    String author;

    @Autowired
    Environment environment;

//    @Autowired
//    public Recipe(){
//        this.author = environment.getProperty("author");
//    }

    @Autowired
    void setName(){
        this.name  = environment.getProperty("recipeName");
    }

    public String description(){
        return "Recipe " + this.name;
    }
}
