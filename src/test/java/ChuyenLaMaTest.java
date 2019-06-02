import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChuyenLaMaTest {

    @Test
    public void test_chuyenlama(){
        assertEquals(new ChuyenLaMa().laMaToNhiPhan("O"),-1);
        assertEquals(new ChuyenLaMa().laMaToNhiPhan("I"),1);
        assertEquals(new ChuyenLaMa().laMaToNhiPhan("II"),2);
        assertEquals(new ChuyenLaMa().laMaToNhiPhan("III"),3);
        assertEquals(new ChuyenLaMa().laMaToNhiPhan("IV"),4);
        assertEquals(new ChuyenLaMa().laMaToNhiPhan("VII"),7);
        assertEquals(new ChuyenLaMa().laMaToNhiPhan("CLVI"),156);
        assertEquals(new ChuyenLaMa().laMaToNhiPhan("CDXCV"),495);
        assertEquals(new ChuyenLaMa().laMaToNhiPhan("CMXCVIII"),998);
    }
}
