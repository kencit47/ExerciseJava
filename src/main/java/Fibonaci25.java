import java.util.ArrayList;

public class Fibonaci25 {

    public int fibonaci25(int m, int n){
        ArrayList<Integer> arrayList = new ArrayList<>();
        int index = 0;

        for(int i = 0; true; i++){
            if(i == 0)
                arrayList.add(0);
            else if(i == 1)
                arrayList.add(1);
            else
                arrayList.add(arrayList.get(i - 2) + arrayList.get(i - 1));

            if(arrayList.get(i) > n) {
                arrayList.remove(i);
                break;
            }
        }

        while(true){

            if(arrayList.get(index) < m)
                arrayList.remove(index);
            else
                return arrayList.size();
        }

    }
}
