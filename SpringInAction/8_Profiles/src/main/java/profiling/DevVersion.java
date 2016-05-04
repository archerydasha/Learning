package profiling;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 03.05.2016.
 */
@Component
@Profile("dev")
public class DevVersion implements VersionInterface {
    public String getVersion() {
        return "Dev version - feel free to commit here";
    }
}
