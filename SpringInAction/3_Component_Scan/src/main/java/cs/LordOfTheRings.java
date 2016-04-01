package cs;

import org.springframework.stereotype.Component;

import java.io.PrintStream;

/**
 * Created by Dasha on 18.03.16.
 */
@Component
public class LordOfTheRings implements CD {

    @Override
    public void play() {
        System.out.println("Playing Lord Of The Rings - the Fellowship of the Ring");
    }
}
