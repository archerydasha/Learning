package autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 09.04.16.
 */
@Component
public class ObjectWriter {
    @Autowired
    OutputWriter writer;

    public OutputWriter getWriter() {
        return writer;
    }
}
