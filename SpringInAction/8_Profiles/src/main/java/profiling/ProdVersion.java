package profiling;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 03.05.2016.
 */
@Component
@Profile("prod")
public class ProdVersion implements VersionInterface {
    public String getVersion() {
        return "PROD VERSION - NEVER EVER BREAK IT";
    }
}
