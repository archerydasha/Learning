package primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 04.05.2016.
 */
@Component
@Primary
public class BrownieCake extends Dessert {
    public BrownieCake(){
        super("Brownie Cake");
    }
}
