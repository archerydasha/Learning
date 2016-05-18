package introduction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Dasha on 5/18/2016.
 */
public class MainClass {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Encoreable encoreable = (Encoreable) context.getBean("greatPerformance");
        encoreable.encore();
    }
}
