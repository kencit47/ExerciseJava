public class Arr_3_TongSoChanTruSoLe {

    public int timTongSoChanLe(int[] a){
        int result = 0;

        for(int n : a){
            if(n % 2 == 1)
                result -= n;
            else
                result += n;
        }

        return result;
    }
}
