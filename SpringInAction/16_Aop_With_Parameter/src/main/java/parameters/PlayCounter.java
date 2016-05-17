package parameters;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Dasha on 5/17/2016.
 */
@Component
@Aspect
public class PlayCounter {
    Map<Integer, Integer> trackPlays = new HashMap<Integer, Integer>();

    @Pointcut("execution(* parameters.CD.playTrack(int)) && args(trackNumber)")
    public void playTrack(int trackNumber) { }

    @Before("playTrack(trackNumber)")
    public void beforePlay(int trackNumber) {
        int played = getTrackPlaysByNumber(trackNumber);
        trackPlays.put(trackNumber, ++played);
    }

    public int getTrackPlaysByNumber(int trackNumber) {
        Integer numberOfPlays = trackPlays.get(trackNumber);
        if (numberOfPlays == null) return 0;
        return numberOfPlays;
    }

}
