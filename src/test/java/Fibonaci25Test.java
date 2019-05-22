import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Fibonaci25Test {
    @Test
    public void test_fibonaci25(){
        assertEquals(new Fibonaci25().fibonaci25(0,2),4);
        assertEquals(new Fibonaci25().fibonaci25(0,0),1);
        assertEquals(new Fibonaci25().fibonaci25(1,5),5);
        assertEquals(new Fibonaci25().fibonaci25(2,50),7);
    }
}
