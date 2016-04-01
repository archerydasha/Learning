package simple.minstrel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dasha on 18.03.16.
 */
public class MainClass {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
    }
}
