import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Arr_1_SoXuanHien2LanTest {
    @Test
    public void test_SoXuanHien2Lan(){
        int[] a = {1,1,2,3,4,3,5,4,3};
        assertEquals(new Arr_1_SoXuanHien2Lan().findNumber(a),"1 3 4");
        int[] b = {0,0,0,3,5,7,7,9,2,1,4,9,5,4,3,5,4,3};
        assertEquals(new Arr_1_SoXuanHien2Lan().findNumber(b),"0 3 4 5 7 9");
    }
}
