import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhanTichThuaSoTest {
    @Test
    public void test_phantichthuaso(){
        assertEquals(new PhanTichThuSo().phanTichThuaSo(8000),"2*2*2*2*2*2*5*5*5");
        assertEquals(new PhanTichThuSo().phanTichThuaSo(8),"2*2*2");
        assertEquals(new PhanTichThuSo().phanTichThuaSo(66),"2*3*11");
        assertEquals(new PhanTichThuSo().phanTichThuaSo(0),"0");
        assertEquals(new PhanTichThuSo().phanTichThuaSo(1),"1");
    }
}
