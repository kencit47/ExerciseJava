import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TinhCanBac2Test {
    @Test
    public void test_tinhcanbac2(){
        assertEquals(new TinhCanBac2().tinhCanBac2(0),0,0.0001);
        assertEquals(new TinhCanBac2().tinhCanBac2(1),1,0.0001);
        assertEquals(new TinhCanBac2().tinhCanBac2(2),1.4142,0.0001);
        assertEquals(new TinhCanBac2().tinhCanBac2(8),2.8284,0.0001);
    }
}
