package jconf;

import java.io.PrintStream;

/**
 * Created by Dasha on 18.03.16.
 */
public class LordOfTheRings implements CD {
    private PrintStream output;

    public LordOfTheRings(PrintStream output) {
        this.output = output;
    }

    @Override
    public void play() {
        System.out.println("Playing Lord Of The Rings - the Fellowship of the Ring");
    }
}
