import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhuongTrinhBac2Test {
    @Test
    public void test_phuongtrinhbac2(){
        assertEquals(new PhuongTrinhBac2().phuongTrinhBac2(2,2,-4),"a + b + c = 0 : 2 nghiem x1 = 1; x2 = c/a");
        assertEquals(new PhuongTrinhBac2().phuongTrinhBac2(4,2,-2),"a - b + c = 0 : 2 nghiem x1 = -1; x2 = -c/a");
        assertEquals(new PhuongTrinhBac2().phuongTrinhBac2(4,2,4),"Delta < 0 : Vo nghiem");
        assertEquals(new PhuongTrinhBac2().phuongTrinhBac2(4,4,1),"Delta = 0 :nghiem kep x1 = x2 = -b/a");
        assertEquals(new PhuongTrinhBac2().phuongTrinhBac2(2,4,1),"Delta > 0 : x1 = -0.2928932188134524;x2 = -1.7071067811865475");
    }
}
