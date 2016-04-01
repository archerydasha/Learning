package jconf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Dasha on 18.03.16.
 */
@Configuration
public class SpringContext {
    @Bean(name = "cd")
    CD getCD(){
        return new LordOfTheRings(System.out);
    }

    @Bean
    CDPlayer cdPlayer(CD cd){
        return new CDPlayer(cd);
    }
}
