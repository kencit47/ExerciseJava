import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TinhPi_2Test {
    @Test
    public void test_tinhpi_2(){
        assertEquals(new TinhPi_2().tinhPi_2(),3.14156,0.00001);
    }
}
