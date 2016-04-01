import cs.CD;
import cs.CDPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.mockito.Mockito.*;

/**
 * Created by Dasha on 18.03.16.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = cs.SpringContext.class)
public class CDTest {

    @Autowired
    CD disc;
    @Autowired
    CDPlayer player;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(disc);
    }
}
