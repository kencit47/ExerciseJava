public class GiaiThua {

    public long tinhGiaiThua(int n){
        long result = 1;
        if(n == 0)
            return 0;
        for(int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }
}
