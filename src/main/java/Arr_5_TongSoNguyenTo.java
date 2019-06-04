public class Arr_5_TongSoNguyenTo {

    public int timTongSoNguyenTo(int[] a){
        int result = 0;

        for(int i : a){
            if(checkSoNguyenTo(i))
                result += i;
        }

        return result;
    }

    private boolean checkSoNguyenTo(int a){
        int count = 0;
        if(a <= 2)
            return false;
        for(int i = 2; i <= Math.sqrt(a); i++){
            if(a % i == 0)
                count++;
        }
        return count == 0;
    }
}
