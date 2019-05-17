public class TinhE {

    public double tinhE(){
        final double saiso = 0.00001;
        int i = 0;
        double e = 0.0;
        double esp = 1.0;

        do{
            e += esp;
            i++;
            esp *= (double) 1 / i;
        }while(esp > saiso);

        return e;
    }
}
