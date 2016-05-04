package conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 03.05.2016.
 */
@Component
@Conditional(GoodChosenWizardCondition.class)
public class GryffindoorHouse implements HogwartsHouse{

    public String getChosenWizard() {
        return "Harry Potter";
    }
}
