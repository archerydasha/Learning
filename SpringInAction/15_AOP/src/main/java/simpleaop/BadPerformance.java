package simpleaop;

import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 5/16/2016.
 */
@Component("badPerformance")
public class BadPerformance extends Performance {

    public BadPerformance() {
        super("Really bad performance");
    }

    @Override
    public void perform() {
        throw new RuntimeException("We broke our instruments and the lead singer is drunk");
    }
}
