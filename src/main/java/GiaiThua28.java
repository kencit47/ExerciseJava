public class GiaiThua28 {

    public int TraVe0(int n){
        long a = giaiThua(n);
        int result = 0;

        while(a > 0){
            if(a % 10 == 0)
                result ++;
            a /= 10;
        }

        return result;
    }

    private long giaiThua(int n){
        if (n == 0) {
            return 1;
        }
        return n * giaiThua(n - 1);
    }
}
