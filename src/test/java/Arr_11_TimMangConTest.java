import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Arr_11_TimMangConTest {
    @Test
    public void test_TimMangCon(){
        int[] a = {1,3,5,8,7,4,1,7,9};
        assertEquals(new Arr_11_TimMangCon().timMangCon(a),"971478531");
    }
}
