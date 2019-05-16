import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TinhLaiTest {
    @Test
    public void test_tinhlainganhang(){
        assertEquals(new TinhLai().tinhLaiNganHang(0),100);
        assertEquals(new TinhLai().tinhLaiNganHang(1),200);
        assertEquals(new TinhLai().tinhLaiNganHang(2),225);
        assertEquals(new TinhLai().tinhLaiNganHang(10),256);
    }

}
