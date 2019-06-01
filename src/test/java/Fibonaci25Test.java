import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Fibonaci25Test {
    @Test
    public void test_fibonaci25(){
        assertEquals(new Fibonaci25().fibonaci25(2,50),7);
        assertEquals(new Fibonaci25().fibonaci25(7,600),9);
        assertEquals(new Fibonaci25().fibonaci25(3,10),3);
    }
}
