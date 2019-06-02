import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ChuyenLaMa {

    public int laMaToNhiPhan(String a){
        int result = 0;

        for (int i = 0; i < a.length(); i++){
            char index = a.charAt(i);
            if(doiLaMa(index) == 0)
                return -1;

            if(index != a.charAt(a.length() - 1)) {
                if(doiLaMa(index) < doiLaMa(a.charAt(i + 1)))
                    result -= doiLaMa(index);
                else
                    result += doiLaMa(index);
            }
            else
                result += doiLaMa(index);
        }

        return result;
    }

    private int doiLaMa(char a) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        hashMap.put('I',1);
        hashMap.put('V',5);
        hashMap.put('X',10);
        hashMap.put('L',50);
        hashMap.put('C',100);
        hashMap.put('D',500);
        hashMap.put('M',1000);

        return hashMap.containsKey(a)? hashMap.get(a) : 0;
    }
}
