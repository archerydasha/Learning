import org.junit.Test;
import simple.knight.Knight;
import simple.knight.Quest;
import static org.mockito.Mockito.*;

/**
 * Created by Dasha on 17.03.16.
 */
public class KnightTest {

    @Test
    public void testKnight() {
        Quest mockQuest = mock(Quest.class);
        Knight knight = new Knight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
