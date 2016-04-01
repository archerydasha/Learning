package jconf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dasha on 18.03.16.
 */
public class MainClass {
    public static void main(String[] args){
        System.out.println("Getting beans from Java Config");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class);
        CDPlayer player = context.getBean(CDPlayer.class);
        player.turnOn();
    }
}
