package properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 5/12/2016.
 */
public class Product {
    private String name;
    private Integer price;


    public Product(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String description(){
        return "Product: name = " + name + ", price = " + price;
    }
}
