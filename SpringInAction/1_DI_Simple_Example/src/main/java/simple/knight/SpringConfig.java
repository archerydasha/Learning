package simple.knight;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Dasha on 17.03.16.
 */
@Configuration
public class SpringConfig {
    @Bean
    public Knight getKnight(){
        return new Knight(getQuest());
    }

    @Bean
    public Quest getQuest() {
        return new TreasuryGettingQuest(System.out);
    }
}
