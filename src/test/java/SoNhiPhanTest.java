import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SoNhiPhanTest {
    @Test
    public void test_sonhiphan(){
        assertEquals(new SoNhiPhan().soNhiPhan(0),0);
        assertEquals(new SoNhiPhan().soNhiPhan(1),1);
        assertEquals(new SoNhiPhan().soNhiPhan(2),1);
        assertEquals(new SoNhiPhan().soNhiPhan(3),3);
        assertEquals(new SoNhiPhan().soNhiPhan(23),29);
        assertEquals(new SoNhiPhan().soNhiPhan(569),625);
    }
}
