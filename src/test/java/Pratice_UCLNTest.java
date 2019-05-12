import org.junit.Test;

public class Pratice_UCLNTest {
    @Test
    public void TestFind_UCLN(){
        System.out.println("UCLN :" + new Practice_UCLN().Find_UCLN(12,168));
    }

    @Test
    public void TestFind_BCNN(){
        System.out.println("BCNN :" + new Practice_UCLN().Find_BCNN(12,168));
    }
}
