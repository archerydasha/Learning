package simple.knight;

import java.io.PrintStream;

/**
 * Created by Dasha on 17.03.16.
 */
public class TreasuryGettingQuest implements Quest{
    private PrintStream output;

    public TreasuryGettingQuest(PrintStream output) {
        this.output = output;
    }

    @Override
    public void embark() {
        output.println("Getting treasury");
    }
}
