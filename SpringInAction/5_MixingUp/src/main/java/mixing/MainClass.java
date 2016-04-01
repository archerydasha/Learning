package mixing;

import mixing.rootconfig.RootConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Dasha on 30.03.16.
 */
public class MainClass {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
        Bicycle bicycle = (Bicycle) context.getBean("bicycle");
        bicycle.printMyself();
    }
}
