package primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 04.05.2016.
 */

@Component
public class IceCream extends Dessert{
    public IceCream() {
        super("Ice Cream");
    }
}
