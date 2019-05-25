import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhuongPhapChiaDoiTest {

    @Test
    public void test_phuongphapchiadoi(){
        assertEquals(new PhuongPhapChiaDoi().phuongPhapChiaDoi(4.2),2.04939,0.0001);
        assertEquals(new PhuongPhapChiaDoi().phuongPhapChiaDoi(63.1),7.94352,0.0001);
    }
}
