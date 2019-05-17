import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TinhBieuThucTest {
    @Test
    public void test_tinhbieuthuc(){
        assertEquals(new TinhBieuThuc().tinhBieuThuc(0),1.0,0.0001);
        assertEquals(new TinhBieuThuc().tinhBieuThuc(1),2.0,0.0001);
        assertEquals(new TinhBieuThuc().tinhBieuThuc(8),2.7182,0.0001);
    }
}
