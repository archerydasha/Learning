package placeholders;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Dasha on 5/13/2016.
 */
@Configuration
public class Config {
    @Bean
    public Product product(@Value("${name}") String name, @Value("${producer}") String producer){
        return new Product(name, producer);
    }

    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer(){
        PropertySourcesPlaceholderConfigurer pc = new PropertySourcesPlaceholderConfigurer();
        pc.setLocation(new ClassPathResource("product.properties"));
        return pc;
    }
}
