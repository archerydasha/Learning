package parameters;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Dasha on 5/17/2016.
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class Config {
    @Bean
    public CD cd(){
        CD cd = new CD("Reise, reise by Rammstein");
        cd.addTrack(new Track("Reise, reise"));
        cd.addTrack(new Track("Amerika"));
        cd.addTrack(new Track("Ohne dich"));
        return cd;
    }
}
