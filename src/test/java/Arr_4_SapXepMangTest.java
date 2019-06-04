import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Arr_4_SapXepMangTest {
    @Test
    public void test_SapXepMang(){
        int[] a = {1,2,3,4,2,6,7,8,5,9,8,7};
        assertEquals(new Arr_4_SapXepMang().sapXepMang(a),0);
    }
}
