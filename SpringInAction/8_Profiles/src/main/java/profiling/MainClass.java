package profiling;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Dasha on 03.05.2016.
 */
public class MainClass {
    public static void main(String[] args){
        System.setProperty("spring.profiles.default", "dev");
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        VersionInterface versionInterface = (VersionInterface) context.getBean(VersionInterface.class);
        System.out.println(versionInterface.getVersion());
        System.setProperty("spring.profiles.active", "test");
        context = new AnnotationConfigApplicationContext(Config.class);
        versionInterface = (VersionInterface) context.getBean(VersionInterface.class);
        System.out.println(versionInterface.getVersion());
        System.setProperty("spring.profiles.active", "prod");
        context = new AnnotationConfigApplicationContext(Config.class);
        versionInterface = (VersionInterface) context.getBean(VersionInterface.class);
        System.out.println(versionInterface.getVersion());
    }
}
