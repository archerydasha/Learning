package simple.minstrel;

import java.io.PrintStream;

/**
 * Created by Dasha on 18.03.16.
 */
public class Minstrel {
    PrintStream output;

    public Minstrel(PrintStream output) {
        this.output = output;
    }

    public void singBeforeQuest(){
        output.print("Quest is about to be embarked!");
    }

    public void singAfterQuest(){
        output.print("Quest is finished!");
    }
}
