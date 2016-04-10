import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Dasha on 09.04.16.
 */
@Configuration
@ComponentScan(basePackageClasses = autoconfig.MarkerForSpring.class)
public class SpringAutoConfig {
}
