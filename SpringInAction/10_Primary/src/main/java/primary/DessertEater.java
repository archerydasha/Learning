package primary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 04.05.2016.
 */
@Component("eater")
public class DessertEater {
    private Dessert preferredDessert;
    @Autowired
    @Qualifier("iceCream")
    private Dessert iceCream;

    @Autowired
    public void setPreferredDessert(Dessert preferredDessert){
        this.preferredDessert = preferredDessert;
    }

    public String happyWords() {
        return "I am eating " + preferredDessert.getName()+ ", but I also like " + iceCream.getName();
    }
}
