package autoconfig;

import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 09.04.16.
 */
@Component
public class JsonOutputWriter implements OutputWriter {

    @Override
    public String defineMyself() {
        return "Using " + this.getClass().getName();
    }
}
