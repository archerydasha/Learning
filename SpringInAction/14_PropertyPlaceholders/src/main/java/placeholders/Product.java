package placeholders;

/**
 * Created by Dasha on 5/13/2016.
 */
public class Product {
    String name;
    String producer;

    public Product(String name, String producer) {
        this.name = name;
        this.producer = producer;
    }

    public String description() {
        return "Product " + name;
    }
}
