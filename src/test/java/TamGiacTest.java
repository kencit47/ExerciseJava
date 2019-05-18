import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TamGiacTest {
    @Test
    public void test_tamgiac(){
        assertEquals(new TamGiac().tamGiac(6,7,8),"Type - chu vi - dien tich : Tam giac thuong - 21 - 20.33316256758894");
        assertEquals(new TamGiac().tamGiac(4,3,9),"Khong phai tam giac");
        assertEquals(new TamGiac().tamGiac(9,4,3),"Khong phai tam giac");
        assertEquals(new TamGiac().tamGiac(4,9,3),"Khong phai tam giac");
        assertEquals(new TamGiac().tamGiac(9,8,9),"Type - chu vi - dien tich : Tam giac can - 26 - 32.2490309931942");
        assertEquals(new TamGiac().tamGiac(9,9,8),"Type - chu vi - dien tich : Tam giac can - 26 - 32.2490309931942");
        assertEquals(new TamGiac().tamGiac(8,9,9),"Type - chu vi - dien tich : Tam giac can - 26 - 32.2490309931942");
        assertEquals(new TamGiac().tamGiac(3,4,5),"Type - chu vi - dien tich : Tam giac vuong - 12 - 6.0");
        assertEquals(new TamGiac().tamGiac(5,4,3),"Type - chu vi - dien tich : Tam giac vuong - 12 - 6.0");
        assertEquals(new TamGiac().tamGiac(3,5,4),"Type - chu vi - dien tich : Tam giac vuong - 12 - 6.0");
    }
}
