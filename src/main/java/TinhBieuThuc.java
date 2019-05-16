public class TinhBieuThuc {

    public double tinhBieuThuc(int n){
        double result = 0.0;
        int mauso = 0;
        double valueafter = 1;

        do{
            result += valueafter;
            mauso++;
            valueafter *= (double) 1/mauso;
        }while (mauso <= n);

        return result;

    }
}
