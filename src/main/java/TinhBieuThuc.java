public class TinhBieuThuc {

    public double tinhBieuThuc(int n){
        double result = 0.0;

        for(int i = 0; i <= n; i++){
            result += (double)1/giaiThua(i);
        }

        return result;

    }

    public long giaiThua(int n){
        long result = 1;

        for(int i = 1; i <= n; i++){
            result *= i;
        }

        return result;
    }
}
