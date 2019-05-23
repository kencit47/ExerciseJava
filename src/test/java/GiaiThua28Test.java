import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiaiThua28Test {

    @Test
    public void test_giaithua28(){
        assertEquals(new GiaiThua28().TraVe0(0),0);
        assertEquals(new GiaiThua28().TraVe0(1),0);
        assertEquals(new GiaiThua28().TraVe0(12),4);
    }
}
