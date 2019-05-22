import java.util.ArrayList;
import java.util.Arrays;

public class CrazyFibonaci26 {

    public int crazyFibonaci(int index, int a0, int a1, int a2, int a3, int a4){
        Integer[] arrInput = {a0,a1,a2,a3,a4};
        int count = 4;

        if(index <= count)
            return arrInput[index];
        for (int i = 4; true; i++){
            int tong = 0;

            for(int j = 0; j < 5; j++){
                tong += arrInput[j];
            }

            for(int k = 0; k < 5; k++)
            {
                if(k == 4)
                    arrInput[k] = tong % 10;
                else
                    arrInput[k] = arrInput[k + 1];
            }
            
            count++;

            if(index == count)
                return tong % 10;
        }
    }
}
