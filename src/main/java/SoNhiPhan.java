import java.util.ArrayList;
import java.util.Collections;

public class SoNhiPhan {
    public int soNhiPhan(int n){
        int result = 0;

        while (n > 0){
            result = result * 2 + (n % 2);
            n /= 2;
        }
        return result;
    }
}
