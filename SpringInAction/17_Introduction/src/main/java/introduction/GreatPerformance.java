package introduction;

import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 5/18/2016.
 */
@Component
public class GreatPerformance implements Performance {
    public void perform() {
        System.out.println("Everyone's happy");
    }
}
