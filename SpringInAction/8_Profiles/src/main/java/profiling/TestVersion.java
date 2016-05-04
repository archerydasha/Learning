package profiling;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 03.05.2016.
 */
@Component
@Profile("test")
public class TestVersion implements VersionInterface {
    public String getVersion() {
        return "Test version - is currently with QA team";
    }
}
