import java.util.ArrayList;
import java.util.Collections;

public class SoNhiPhan {
    public int soNhiPhan(int n){
        int result = 0;
        ArrayList<Integer> arr = new ArrayList<>();

        while (n > 0){
            arr.add(n % 2);
            n /= 2;
        }
        Collections.reverse(arr);
        for(int i = arr.size() - 1; i >=  0; i--) {
            result += arr.get(i) * Math.pow(2, i);
        }
        return result;
    }
}
