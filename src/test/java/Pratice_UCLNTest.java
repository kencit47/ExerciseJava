import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Pratice_UCLNTest {
    @Test
    public void TestFind_UCLN(){
        assertEquals(new Practice_UCLN().Find_UCLN(12,168),12);
        assertEquals(new Practice_UCLN().Find_UCLN(0,20),0);
        assertEquals(new Practice_UCLN().Find_UCLN(168,12),12);
        assertEquals(new Practice_UCLN().Find_UCLN(12,12),12);
        assertEquals(new Practice_UCLN().Find_UCLN(169,12),1);
    }

    @Test
    public void TestFind_BCNN(){
        new Practice_UCLN().Find_BCNN(12,168);
    }
}
