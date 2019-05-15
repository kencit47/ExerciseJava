import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TinhPiTest {
    @Test
    public void test_tinhpi(){
        assertEquals(new TinhPi().tinhPi(),3.1416,0.0001);
    }
}
