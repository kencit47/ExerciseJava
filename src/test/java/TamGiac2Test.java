import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TamGiac2Test {
    @Test
    public void test_tamgiac2(){
        assertEquals(new TamGiac2().tamGiac2(3,3,5,5,3,7),"Type - chu vi - dien tich : Tam giac can - 9.65685424949238 - 4.0");
        assertEquals(new TamGiac2().tamGiac2(5,5,3,3,3,7),"Type - chu vi - dien tich : Tam giac can - 9.65685424949238 - 4.0");
        assertEquals(new TamGiac2().tamGiac2(3,3,3,7,5,5),"Type - chu vi - dien tich : Tam giac can - 9.65685424949238 - 4.0");
        assertEquals(new TamGiac2().tamGiac2(6,10,8,7,11,9),"Type - chu vi - dien tich : Tam giac vuong - 12.310122064520764 - 6.5");
        assertEquals(new TamGiac2().tamGiac2(8,7,6,10,11,9),"Type - chu vi - dien tich : Tam giac vuong - 12.310122064520762 - 6.5");
        assertEquals(new TamGiac2().tamGiac2(6,10,11,9,8,7),"Type - chu vi - dien tich : Tam giac vuong - 12.310122064520764 - 6.5");
        assertEquals(new TamGiac2().tamGiac2(9,9,36,25,81,49),"Type - chu vi - dien tich : Tam giac thuong - 164.74975078084645 - 36.0");
        assertEquals(new TamGiac2().tamGiac2(1,1,5,5,3,3),"Khong phai tam giac");
        assertEquals(new TamGiac2().tamGiac2(5,5,1,1,3,3),"Khong phai tam giac");
        assertEquals(new TamGiac2().tamGiac2(1,1,3,3,5,5),"Khong phai tam giac");
    }

}
