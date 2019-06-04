public class Arr_2_Tong3SoLonNhat {

    public int timTong3SoLonNhat(int[] a){
        int result = 0;

        for(int i = 0; i < 3; i++) {
            for (int k = i + 1; k < a.length; k++){
                if(a[i] < a[k]) {
                    int temp = a[i];
                    a[i] = a[k];
                    a[k] = temp;
                }
            }
                result += a[i];
        }

        return result;
    }
}
