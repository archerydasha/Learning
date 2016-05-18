package introduction;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 5/18/2016.
 */
@Component
@Aspect
public class EncoringAspect {
    @DeclareParents(value = "introduction.Performance+",
                    defaultImpl = EncoreableImpl.class)
    public static Encoreable encoreable;
}
