import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TongSoNguyenTest {

    @Test
    public void test_TimTongSoNguyen(){
        assertEquals(new TongSoNguyen().TimTongSoNguyen(78),15);
        assertEquals(new TongSoNguyen().TimTongSoNguyen(9),9);
        assertEquals(new TongSoNguyen().TimTongSoNguyen(31452),15);
    }
}
