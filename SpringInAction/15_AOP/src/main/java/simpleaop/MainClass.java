package simpleaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Dasha on 5/16/2016.
 */
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Performance firstPerformance = (Performance) context.getBean("musicPerformance");
        firstPerformance.perform();

        try {
            Performance secondPerformance = (Performance) context.getBean("badPerformance");
            secondPerformance.perform();
        } catch (Throwable t) {
            t.printStackTrace();
        }

        try {
            Performance thirdPerformance = (Performance) context.getBean("failedPerformance");
            thirdPerformance.perform();
        } catch (Throwable t) {
            t.printStackTrace();
        }

    }
}
