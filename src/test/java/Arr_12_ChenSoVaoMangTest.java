import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Arr_12_ChenSoVaoMangTest {
    @Test
    public void test_ChenSoVaoMang(){
        int[] a = {2,3,4,6,7,8,9,11,14};
        assertEquals(new Arr_12_ChenSoVaoMang().chenSoVaoMang(1,a),"1 2 3 4 6 7 8 9 11 14");
        assertEquals(new Arr_12_ChenSoVaoMang().chenSoVaoMang(5,a),"2 3 4 5 6 7 8 9 11 14");
        assertEquals(new Arr_12_ChenSoVaoMang().chenSoVaoMang(16,a),"2 3 4 6 7 8 9 11 14 16");
    }
}
