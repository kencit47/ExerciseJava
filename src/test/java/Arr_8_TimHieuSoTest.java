import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Arr_8_TimHieuSoTest {
    @Test
    public void test_HieuSo(){
        int[] a = {6,2,1,5,6,7,4,4,9,3,2,1};
        assertEquals(new Arr_8_TimHieuSo().timHieuSo(a), 8);
    }
}
