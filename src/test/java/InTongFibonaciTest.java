import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InTongFibonaciTest {
    @Test
    public void test_intongfibonaci(){
        assertEquals(new InTongFibonaci().tongFibonaci(0),0);
        assertEquals(new InTongFibonaci().tongFibonaci(1),1);
        assertEquals(new InTongFibonaci().tongFibonaci(8),54);
        assertEquals(new InTongFibonaci().tongFibonaci(3),4);
    }
}
