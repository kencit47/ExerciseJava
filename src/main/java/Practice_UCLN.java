import java.util.ArrayList;

public class Practice_UCLN {

    public int Find_UCLN(int a, int b){
        if(a == b)
            return a;
        if(a % b == 0) {
            return a > b ? b : a;
        }
        return a % b;
    }

    public int Find_BCNN(int a, int b){
        return (a * b) / Find_UCLN(a ,b);
    }
}
