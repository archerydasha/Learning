package cs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 18.03.16.
 */
@Component
public class CDPlayer {
    private CD disc;

    @Autowired
    public CDPlayer(CD disc) {
        this.disc = disc;
    }

    public void turnOn(){
        disc.play();
    }
}
