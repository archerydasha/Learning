package custom;

import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 04.05.2016.
 */
@Cold
@WithFreshBerries
@Component
public class Yoghurt extends Dessert {
    public Yoghurt(){
        super("Yoghurt");
    }
}
