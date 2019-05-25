import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TamGiacPascalTest {
    @Test
    public void test_tamgiacpascal(){
        assertEquals(new TamGiacPascal().tamGiacPascal(0),"1");
        assertEquals(new TamGiacPascal().tamGiacPascal(1),"1 1");
        assertEquals(new TamGiacPascal().tamGiacPascal(2),"1 2 1");
        assertEquals(new TamGiacPascal().tamGiacPascal(5),"1 5 10 10 5 1");
    }
}
