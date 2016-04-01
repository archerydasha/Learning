package simple.minstrel;

import java.io.PrintStream;

/**
 * Created by Dasha on 17.03.16.
 */
public class DragonSlayingQuest implements Quest {
    PrintStream output;

    public DragonSlayingQuest(PrintStream output) {
        this.output = output;
    }

    @Override
    public void embark() {
        output.println("Goodbye, dragon.");
    }
}
