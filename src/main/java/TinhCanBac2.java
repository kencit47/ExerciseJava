public class TinhCanBac2 {
    public double tinhCanBac2(int n){
        final double saiso = 0.0001;
        double f = n;
        double result;

        do{
            result = f;
            f = (double)n/(2*f) + f/2;
        }while(result - f > saiso);

        return result;
    }
}
