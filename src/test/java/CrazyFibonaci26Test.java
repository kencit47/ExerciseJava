import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CrazyFibonaci26Test {
    @Test
    public void test_crazyfibonaci26(){
        assertEquals(new CrazyFibonaci26().crazyFibonaci(0,1,2,3,4,5),1);
        assertEquals(new CrazyFibonaci26().crazyFibonaci(5,1,2,3,4,5),5);
        assertEquals(new CrazyFibonaci26().crazyFibonaci(6,1,2,3,4,5),9);
        assertEquals(new CrazyFibonaci26().crazyFibonaci(7,1,2,3,4,5),6);
        assertEquals(new CrazyFibonaci26().crazyFibonaci(27,10,52,26,45,5),1);
    }
}
