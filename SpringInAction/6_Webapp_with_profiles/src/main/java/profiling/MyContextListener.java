package profiling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.springframework.web.context.ContextLoaderListener;
/**
 * Created by Dasha on 01.04.16.
 */
public class MyContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Greeter greeter = (Greeter)context.getBean(Greeter.class);
        String greeting = greeter.sayHello();
        servletContextEvent.getServletContext().setAttribute("greeting", greeting);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
