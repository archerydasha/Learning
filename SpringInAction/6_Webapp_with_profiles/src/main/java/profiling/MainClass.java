package profiling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Dasha on 01.04.16.
 */
public class MainClass {
    public static void main(String[] args){
        System.setProperty("spring.profiles.default", "yuki");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Greeter greeter = (Greeter)context.getBean(Greeter.class);
        String greeting = greeter.sayHello();
        System.out.println(greeting);
    }
}
