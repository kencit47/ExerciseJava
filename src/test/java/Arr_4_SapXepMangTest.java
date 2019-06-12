import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Arr_4_SapXepMangTest {
    @Test
    public void test_SapXepMang(){
        int[] a = {2,1,3,4,2,6,7,8,5,9,8,7};
        assertEquals(new Arr_4_SapXepMang().sapXepMang(a),"2 2 4 6 8 8 9 7 7 5 3 1");
    }
}
