import java.util.ArrayList;

public class Practice_UCLN {
    ArrayList<Integer> arr_num1 = new ArrayList<>();
    ArrayList<Integer> arr_num2 = new ArrayList<>();

    public int Find_UCLN(int num1){
        int i = 2;
        while (num1 != 1) {
            if (num1 % i == 0) {
                System.out.println("#CHECK :" + i);
                num1 /= 2;
            } else
                i++;
        }
        return num1;
    }
}
