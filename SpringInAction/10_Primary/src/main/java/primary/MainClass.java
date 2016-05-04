package primary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Dasha on 04.05.2016.
 */
public class MainClass {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        DessertEater eater = (DessertEater) context.getBean("eater");
        System.out.println(eater.happyWords());
    }
}
