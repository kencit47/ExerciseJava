public class TinhBieuThuc {

    public double tinhBieuThuc(int n){
        double result = 0.0;
        int mauso = 0;
        double valueafter = 1;

        for(int i = 0; i <= n; i++){
            result += valueafter;
            mauso++;
            valueafter *= (double) 1/mauso;
        }

        return result;
    }
}
