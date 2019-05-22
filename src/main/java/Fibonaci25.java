import java.util.ArrayList;

public class Fibonaci25 {

    public int fibonaci25(int m, int n){
        int x = 0;
        int a = 0;
        int b = 1;

        while(a + b <= n){
            int index = a + b;
            if(index >= m)
                x++;
            a = b;
            b = index;
        }
        if(m == 0 && n >= 1)
            x += 2;
        if(m == 1 || m == 0 && n == 0)
            x += 1;

        return x;
    }
}
