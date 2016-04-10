import autoconfig.ObjectWriter;
import javaconfig.CatCafe;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import xmlconfig.Cinema;

/**
 * Created by Dasha on 09.04.16.
 */
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MainSpringConfig.class);
        ObjectWriter objectWriter = (ObjectWriter) context.getBean(ObjectWriter.class);
        System.out.println("\n\nGetting ObjectWriter example from AutoScanned config:");
        System.out.println(objectWriter.getWriter().defineMyself());


        CatCafe catCafe = (CatCafe) context.getBean(CatCafe.class);
        System.out.println("\n\nGetting CatCafe example from Explicit Java config:");
        System.out.println(catCafe.printGreetings());

        Cinema cinema = (Cinema) context.getBean(Cinema.class);
        System.out.println("\n\nGetting Cinema example from Explicit XML config:");
        System.out.println(cinema.printMovies());
    }
}
