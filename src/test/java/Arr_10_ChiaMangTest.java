import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Arr_10_ChiaMangTest {
    @Test
    public void test_ChiaMang(){
        int[] a = {1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1};
        assertEquals(new Arr_10_ChiaMang().chiaMang(4,a),"123456 789123 456789 1");
    }
}
