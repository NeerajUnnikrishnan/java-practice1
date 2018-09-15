import com.company.AlphaTypeChecker;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AlphaTypeCheckerTest {

    AlphaTypeChecker checker = new AlphaTypeChecker();
    @Before
    public void setUp() throws Exception {
        AlphaTypeChecker checker;
    }

    @After
    public void tearDown() throws Exception {
        checker = null;
    }

    @Test
    public void check() {
        assertEquals("Vowel", checker.Check('e'));
        assertEquals("Consonant", checker.Check('y'));
    }
}