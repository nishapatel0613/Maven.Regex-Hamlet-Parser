import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;
    private String horatioText;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
        this.horatioText = hamletParser.getHoratioData();

    }

    @Test
    public void testChangeHamletToLeon() {
        Assert.assertTrue(hamletText.contains("Leon"));
        Assert.assertFalse(hamletText.contains("[Hh][Aa][Mm][Ll][Ee][Tt]"));
    }

    @Test
    public void testChangeHoratioToTariq() {
        Assert.assertTrue(horatioText.contains("Tariq"));
        Assert.assertFalse(horatioText.contains("[Hh][Oo][Rr][Aa][Tt][Ii][Oo]"));
    }

    @Test
    public void testFindHoratio() {
        int expected = 158;
        int actual = hamletParser.horatioNumbers();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testFindHamlet() {
        int expected = 472;
        int actual = hamletParser.hamletNumbers();

        Assert.assertEquals(expected,actual);
    }
}