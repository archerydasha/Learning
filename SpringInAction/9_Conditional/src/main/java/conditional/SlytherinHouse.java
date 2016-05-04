package conditional;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 04.05.2016.
 */
@Component
@Conditional(BadChosenWizardCondition.class)
public class SlytherinHouse implements HogwartsHouse {

    public String getChosenWizard() {
        return "You Know Who";
    }
}
