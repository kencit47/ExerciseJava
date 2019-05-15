import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiaiThuaTest {
    @Test
    public void test_giaithua(){
        assertEquals(new GiaiThua().tinhGiaiThua(0),0);
        assertEquals(new GiaiThua().tinhGiaiThua(1),1);
        assertEquals(new GiaiThua().tinhGiaiThua(6),720);
    }
}
