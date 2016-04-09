package profiling;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by Dasha on 01.04.16.
 */
@Configuration
public class SpringConfig {
    @Bean
    @Profile("eaton")
    public Greeter blackCatGreeter(){
        return new BlackCatGreeter();
    }

    @Bean
    @Profile("yuki")
    public Greeter whiteCatGreeter(){
        return new WhiteCatGreeter();
    }
}
