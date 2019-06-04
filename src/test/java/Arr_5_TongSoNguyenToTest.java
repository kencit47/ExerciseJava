import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Arr_5_TongSoNguyenToTest {
    @Test
    public void test_TongSoNguyenTo(){
        int[] a = {1,2,3,4,5,6,7,8,7,3,17,23,21};
        assertEquals(new Arr_5_TongSoNguyenTo().timTongSoNguyenTo(a),65);
    }
}
