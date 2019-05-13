import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindFibonaciTest {
    @Test
    public void test_FindFibonaci(){
        assertEquals(new FindFibonaci().findFibonaci(0),"0");
        assertEquals(new FindFibonaci().findFibonaci(1),"0");
        assertEquals(new FindFibonaci().findFibonaci(800),"1 - 1 - 2 - 3 - 5 - 8 - 13 - 21 - 34 - 55 - 89 - 144 - 233 - 377 - 610");
        assertEquals(new FindFibonaci().findFibonaci(8),"1 - 1 - 2 - 3 - 5");
    }
}
