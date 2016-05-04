package conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;


import java.lang.annotation.Annotation;

/**
 * Created by Dasha on 03.05.2016.
 */
public class GoodChosenWizardCondition implements Condition {
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return context.getEnvironment().getProperty("chosenWizardType").equals("good");
    }
}