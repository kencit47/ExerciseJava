public class TinhE {

    public double tinhE(){
        final double saiso = 0.00001;
        int i = 0;
        double e = 0.0;
        double esp;

        do{
            esp = (double) 1 / giaiThua(i);
            e += esp;
            i++;
        }while(esp > saiso);

        return e;
    }

    private long giaiThua(int n){
        long result = 1;

        for(int i = 1; i <= n; i++){
            result *= i;
        }

        return result;
    }
}
