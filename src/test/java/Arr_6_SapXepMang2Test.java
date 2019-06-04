import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Arr_6_SapXepMang2Test {
    @Test
    public void test_SapXepMang2(){
        int[] a = {2,1,3,8,7,9,5,6,4};
        assertEquals(new Arr_6_SapXepMang2().sapXepMang2(a),"2 9 7 4 5 3 1 6 8");
    }
}
