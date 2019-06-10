public class Arr_8_TimHieuSo {
    public int timHieuSo(int[] a){
        int result = 0;

        for(int i : a){
            for(int k : a){
                if(result < i - k)
                    result = i - k;
            }
        }

        return result;
    }
}
