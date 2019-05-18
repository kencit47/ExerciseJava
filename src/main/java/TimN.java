import java.util.ArrayList;

public class TimN {
    public String timN(){
        String result = "";
        ArrayList<Integer> arrResult = new ArrayList<>();

        for(int i = 10; i <= 99999; i++)
            if(timTong(i) == i)
            {
                arrResult.add(i);
            }

        for(int i : arrResult)
        {
            if(arrResult.get(arrResult.size() - 1) == i)
                result += i;
            else
                result += i + " , ";
        }
        return result;
    }

    private int timTong(int n){
        int result = 0;
        int value = 1;
        int luythua = timLuyThua(n);

        while (n > 0){
            result += Math.pow(n % 10,luythua);
            n /= 10;
        }
        return result;
    }

    private int timLuyThua(int n){
        int result = 0;
        while (n > 0){
            n /= 10;
            result++;
        }
        return result;
    }
}
