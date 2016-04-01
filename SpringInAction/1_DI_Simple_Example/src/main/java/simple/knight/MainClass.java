package simple.knight;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dasha on 17.03.16.
 */
public class MainClass {
    public static void main(String[] args){
        System.out.println("Loading context from XML config");
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();

        System.out.println("Loading context from Java config");
        ApplicationContext javaContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        Knight javaKnight = javaContext.getBean(Knight.class);
        javaKnight.embarkOnQuest();
    }
}
