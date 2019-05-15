import java.util.ArrayList;

public class FindFibonaci {

    public String findFibonaci(int n){
        String result = "";
        ArrayList<Integer> arrResultInt = new ArrayList<>();
        int i = 0;
        if(n < 2)
            return result + 0;
        while (true){
            if(i == 0 || i == 1){
                arrResultInt.add(1);
            }
            else {
                int a = arrResultInt.get(i-2)+arrResultInt.get(i-1);
                if(a < n)
                    arrResultInt.add(a);
                else
                    break;
            }
            i++;
        }
        for(int b : arrResultInt){
            if(b == arrResultInt.get(arrResultInt.size()-1))
                result += b;
            else
                result += b + " - ";
        }
        return result;
    }
}
