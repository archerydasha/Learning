package profiling;

import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 01.04.16.
 */
@Component
public class BlackCatGreeter implements Greeter {
    @Override
    public String sayHello() {
        return "Hello, Eaton!";
    }
}
