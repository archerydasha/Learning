package parameters;

import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Dasha on 5/17/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = parameters.Config.class)
public class PlayCounterTest {
    @Autowired
    CD cd;

    @Autowired
    PlayCounter counter;

    @Test
    public void testPlayCounter(){
        cd.playTrack(0);
        cd.playTrack(1);
        cd.playTrack(1);
        cd.playTrack(1);
        cd.playTrack(1);
        cd.playTrack(2);
        cd.playTrack(2);
        cd.playTrack(2);
        assertEquals(1, counter.getTrackPlaysByNumber(0));
        assertEquals(4, counter.getTrackPlaysByNumber(1));
        assertEquals(3, counter.getTrackPlaysByNumber(2));
    }
}
