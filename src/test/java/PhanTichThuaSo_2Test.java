import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhanTichThuaSo_2Test {
    @Test
    public void test_PhanTichThuaSo(){
        assertEquals(new PhanTichThuaSo_2().hamPhanTichThuaSo(8000),"2^6*5^3");
        assertEquals(new PhanTichThuaSo_2().hamPhanTichThuaSo(8),"2^3");
        assertEquals(new PhanTichThuaSo_2().hamPhanTichThuaSo(66),"2*3*11");
        assertEquals(new PhanTichThuaSo_2().hamPhanTichThuaSo(0),"0");
        assertEquals(new PhanTichThuaSo_2().hamPhanTichThuaSo(1),"1");
    }
}
