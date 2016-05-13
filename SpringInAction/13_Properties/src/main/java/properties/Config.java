package properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by Dasha on 5/12/2016.
 */
@Configuration
@ComponentScan
@PropertySource("classpath:product.properties")
public class Config {
    @Autowired
    Environment environment;

    @Bean
    Product getProduct(){
        return new Product(environment.getProperty("name"), environment.getProperty("price", Integer.class));
    }
}
