import java.util.ArrayList;

public class Fibonaci24 {

    public int fibonaci24(int n){
        ArrayList<Integer> arrFibonnaci = new ArrayList<>();

        for(int i = 0; true; i++){
            if(i == 0)
                arrFibonnaci.add(0);
            else if(i == 1)
                arrFibonnaci.add(1);
            else
                arrFibonnaci.add(arrFibonnaci.get(i - 2) + arrFibonnaci.get(i - 1));

            if(arrFibonnaci.get(i) > n)
                return arrFibonnaci.size() - 1;
        }
    }
}
