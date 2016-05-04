package custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 04.05.2016.
 */
@Component("eater")
public class DessertEater {
    @Autowired
    @Warm
    @Milky
    private Dessert thisShouldBeCheeseCake;

    @Autowired
    @Warm
    @WithFreshBerries
    private Dessert thisShouldBeHomemadePie;


    @Autowired
    @Cold
    @Milky
    private Dessert thisShouldBeIceCream;

    @Autowired
    @Cold
    @WithFreshBerries
    private Dessert thisShouldBeYoghurt;

    public String happyWords() {
        return "I am eating :\n" +
                thisShouldBeCheeseCake.getName()+ ", \n" +
                thisShouldBeHomemadePie.getName()+ ", \n" +
                thisShouldBeIceCream.getName()+ ", \n" +
                thisShouldBeYoghurt.getName()+ ".";
    }
}
