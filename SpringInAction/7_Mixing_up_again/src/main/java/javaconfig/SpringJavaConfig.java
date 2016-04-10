package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dasha on 09.04.16.
 */
@Configuration
public class SpringJavaConfig {
    @Bean
    Menu menu(){
        return new SpringMenu();
    }

    @Bean
    CatCafe catCafe(Menu menu){
        List<Cat> cats = new ArrayList<Cat>();
        cats.add(new DomesticCat("Kropek"));
        cats.add(new DomesticCat("Przeczynek"));
        cats.add(new DomesticCat("Szczenciara"));
        return new CatCafe(menu, cats);
    }

}
