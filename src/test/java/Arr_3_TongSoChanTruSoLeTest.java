import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Arr_3_TongSoChanTruSoLeTest {
    @Test
    public void test_TongSoChanLe(){
        int[] a = {1,3,5,4,1,2,4,8,7,9,6,5,4,2,1,4,5,6,9,8};
        assertEquals(new Arr_3_TongSoChanTruSoLe().timTongSoChanLe(a),2);
    }
}
