import java.util.ArrayList;

public class InTongFibonaci {

    public int tongFibonaci(int n){
        int count = 0;
        int result = 0;
        ArrayList<Integer> arrFibonaci = new ArrayList<>();

        for(int i = 0; i < n; i ++) {
            if (i == 0 || i == 1) {
                arrFibonaci.add(1);
            } else {
                arrFibonaci.add(arrFibonaci.get(i - 2) + arrFibonaci.get(i - 1));
            }
            result += arrFibonaci.get(i);
        }

        return result;
    }
}
