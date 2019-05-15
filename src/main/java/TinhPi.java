public class TinhPi {
    public double tinhPi(){
       final double saiso = 0.0001;
        double pi = 0.0;
        int mauso = 1;
        double tuso = 4.0;
        double esp = tuso/mauso - tuso/(mauso + 2);

        while(esp > saiso - tuso/mauso) {
            pi += esp;
            mauso += 4;
            esp = tuso/mauso - tuso/(mauso + 2);
        }
        return pi + saiso;
    }
}
