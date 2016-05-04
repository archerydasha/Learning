package custom;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 04.05.2016.
 */
@Warm
@WithFreshBerries
@Component
public class HomemadePie extends Dessert {
    public HomemadePie(){
        super("Homemade Pie");
    }
}
