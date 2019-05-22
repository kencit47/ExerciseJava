import java.util.ArrayList;

public class Fibonaci25 {

    public int fibonaci25(int m, int n){
        int x = 0;
        Integer[] arrFibonaci = {0,1};

        while(arrFibonaci[1] + arrFibonaci[0] <= n){
            int index = arrFibonaci[1] + arrFibonaci[0];
            if(index >= m)
                x++;
            arrFibonaci[0] = arrFibonaci[1];
            arrFibonaci[1] = index;
        }
        if(m == 0 && n >= 1)
            x += 2;
        if(m == 1 || m == 0 && n == 0)
            x += 1;

        return x;
    }
}
