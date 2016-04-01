package mixing.rootconfig;

import mixing.OutputWriter;
import mixing.derailleur.DerailleurConfig;
import mixing.brakes.BrakesConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Dasha on 30.03.16.
 */
@Configuration
@Import({BrakesConfig.class, DerailleurConfig.class})
@ImportResource("classpath:spring-config.xml")
public class RootConfig {
    @Bean
    public OutputWriter getWriter() {
        return new OutputWriter(System.out);
    }

}
