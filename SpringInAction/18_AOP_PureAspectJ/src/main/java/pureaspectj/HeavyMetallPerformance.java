package pureaspectj;

import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 5/18/2016.
 */
@Component
public class HeavyMetallPerformance implements Performance {
    public void perform() {
        System.out.println("Dum-dum-dum-dudum");
    }
}
