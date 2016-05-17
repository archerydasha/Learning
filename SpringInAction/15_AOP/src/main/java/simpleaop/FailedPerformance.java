package simpleaop;

import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 5/17/2016.
 */
@Component
public class FailedPerformance extends Performance {
    public FailedPerformance() {
        super("Everything failed");
    }

    @Override
    public void perform() {
        throw new FireException("Someone burnt a guitar on the scene");
    }
}
