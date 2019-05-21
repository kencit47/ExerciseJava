import java.util.ArrayList;
import java.util.Arrays;

public class CrazyFibonaci26 {

    public int crazyFibonaci(int index, int a0, int a1, int a2, int a3, int a4){

        Integer[] arrInput = {a0,a1,a2,a3,a4};
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList((arrInput)));

        for (int i = 4; true; i++){
            int tong = 0;

            for(int j = 0; j < 5; j++){
                tong += arrayList.get(i - j);
            }
            arrayList.add(tong % 10);

            if(arrayList.size() > index){
                return arrayList.get(index);
            }
        }
    }
}
