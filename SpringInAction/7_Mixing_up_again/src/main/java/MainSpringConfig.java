import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Dasha on 09.04.16.
 */
@ImportResource("classpath:spring-config.xml")
@Import({SpringAutoConfig.class, javaconfig.SpringJavaConfig.class})
public class MainSpringConfig {
}
