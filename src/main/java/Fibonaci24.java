import java.util.ArrayList;

public class Fibonaci24 {

    public int fibonaci24(int n){
        int a = 0;
        int b = 1;
        int count = 0;

        while (a + b <= n){
            int index = a + b;
            count++;
            a = b;
            b = index;

        }
        if(n == 0)
            count += 1;
        if(n >= 1)
            count += 2;

        return count;
    }
}
