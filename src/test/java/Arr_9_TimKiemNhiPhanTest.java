import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Arr_9_TimKiemNhiPhanTest {
    @Test
    public void test_TimKiemNhiPhan(){
        int[] a = {1,2,3,4,5,6,7,8,9};
        assertEquals(new Arr_9_TimKiemNhiPhan().timKiemNhiPhan(8,a),7);
        assertEquals(new Arr_9_TimKiemNhiPhan().timKiemNhiPhan(0,a),-1);
        assertEquals(new Arr_9_TimKiemNhiPhan().timKiemNhiPhan(2,a),1);
    }
}
