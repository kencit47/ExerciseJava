import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TinhETest {
    @Test
    public void test_tinhe(){
        assertEquals(new TinhE().tinhE(),2.71828,0.00001);
    }
}
