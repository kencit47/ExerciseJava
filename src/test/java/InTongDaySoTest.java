import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InTongDaySoTest {
    @Test
    public void test_intongdayso(){
        assertEquals(new InTongDaySo().inTongDaySo(0),0);
        assertEquals(new InTongDaySo().inTongDaySo(1),2);
        assertEquals(new InTongDaySo().inTongDaySo(5),70);
    }

}
