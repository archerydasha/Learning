package mixing.brakes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Dasha on 30.03.16.
 */
@Configuration
public class BrakesConfig {
    @Bean
    public Brakes getBrakes(){
        return new VBrakes();
    }
}
