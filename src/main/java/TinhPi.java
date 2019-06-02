public class TinhPi {
    public double tinhPi(){
       final double saiso = 0.00000001;
        double pi = 0.0;
        int i = 1;
        double tuso = 4.0;
        double esp;

        do
         {
            esp = tuso/i - tuso/(i + 2);
            pi += esp;
            i += 4;

        }while(esp > saiso);

        return pi;
    }
}
