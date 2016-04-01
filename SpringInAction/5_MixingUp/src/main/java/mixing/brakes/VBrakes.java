package mixing.brakes;

import mixing.OutputWriter;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 30.03.16.
 */
public class VBrakes implements Brakes {
    @Override
    public void printMyself(OutputWriter writer) {
        writer.print("Brake types: V-Brakes");
    }
}
