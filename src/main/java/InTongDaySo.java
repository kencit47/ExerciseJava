import java.util.ArrayList;

public class InTongDaySo {
    public int inTongDaySo(int n){
        int result= 0;
        ArrayList<Integer> arrResult = new ArrayList<>();
        if(n == 0)
            return result;
        for(int i = 1; i <= n; i++){
            arrResult.add(i * (i+1));
        }
        for(int s : arrResult)
        {
            result += s;
        }
        return result;
    }
}
