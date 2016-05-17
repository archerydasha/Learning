package simpleaop;

import org.springframework.stereotype.Component;

/**
 * Created by Dasha on 5/16/2016.
 */
@Component("musicPerformance")
public class MusicPerformance extends Performance {
    public MusicPerformance() {
        super("BEST MUSIC EVER");
    }
}
