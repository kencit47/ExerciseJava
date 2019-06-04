import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThapPhanSanLamaTest {
    @Test
    public void test_thapphansanglama(){
        assertEquals(new thapPhanSangLama().thapPhanSangLaMa(1),"I");
        assertEquals(new thapPhanSangLama().thapPhanSangLaMa(95),"XCV");
        assertEquals(new thapPhanSangLama().thapPhanSangLaMa(851),"DCCCLI");
        assertEquals(new thapPhanSangLama().thapPhanSangLaMa(999),"CMXCIX");
    }
}
