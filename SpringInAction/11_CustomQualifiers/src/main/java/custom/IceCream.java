package custom;

import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 04.05.2016.
 */
@Cold
@Milky
@Component
public class IceCream extends Dessert{
    public IceCream() {
        super("Ice Cream");
    }
}
