package mixing.derailleur;

import mixing.OutputWriter;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 30.03.16.
 */
@Component("backDerailleur")
public class ShimanoSD implements Derailleur {
    @Override
    public void printMyself(OutputWriter writer) {
        writer.print("Back derailleur: also Shimano Tourney, but needed another name to test it");
    }
}
