package introduction;

import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 5/18/2016.
 */
@Component
public class EncoreableImpl implements Encoreable {

    public void encore() {
        System.out.println("Performing encore");
    }
}
