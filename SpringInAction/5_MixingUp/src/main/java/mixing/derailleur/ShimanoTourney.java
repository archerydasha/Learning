package mixing.derailleur;

import mixing.OutputWriter;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 30.03.16.
 */
@Component("frontDerailleur")
public class ShimanoTourney implements Derailleur {
    @Override
    public void printMyself(OutputWriter writer) {
        writer.print("Front derailleur: Shimano Tourney");
    }
}
