import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Fibonaci24Test {
    @Test
    public void test_Fibonaci24(){
        assertEquals(new Fibonaci24().fibonaci24(0),1);
        assertEquals(new Fibonaci24().fibonaci24(1),3);
        assertEquals(new Fibonaci24().fibonaci24(10),7);
    }
}
