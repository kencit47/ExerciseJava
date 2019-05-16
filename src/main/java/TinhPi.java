public class TinhPi {
    public double tinhPi(){
       final double saiso = 0.0001;
        double pi = 0.0;
        int mauso = 1;
        double tuso = 4.0;
        double esp;

        do
         {
            esp = tuso/mauso - tuso/(mauso + 2);
            pi += esp;
            mauso += 4;

        }while(esp > saiso - tuso / mauso);
        return pi + saiso;
    }
}
