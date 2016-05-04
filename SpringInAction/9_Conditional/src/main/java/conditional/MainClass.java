package conditional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Dasha on 04.05.2016.
 */
public class MainClass {
    public static void main(String args[]){
        System.setProperty("chosenWizardType", "good");
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        HogwartsHouse house = (HogwartsHouse) context.getBean(HogwartsHouse.class);
        System.out.println(house.getChosenWizard());
        System.setProperty("chosenWizardType", "bad");
        context = new AnnotationConfigApplicationContext(Config.class);
        house = (HogwartsHouse) context.getBean(HogwartsHouse.class);
        System.out.println(house.getChosenWizard());
    }
}
