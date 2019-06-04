import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Arr_2_Tong3SoLonNhatTest {
    @Test
    public void test_Tong3SoLonNhat(){
        int[] a = {5,2,1,3,6,5,4,8,7,9,5};
        assertEquals(new Arr_2_Tong3SoLonNhat().timTong3SoLonNhat(a),24);
    }
}
