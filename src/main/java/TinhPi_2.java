public class TinhPi_2 {
    public double tinhPi_2(){
        final double saiso = 0.00001;
        int mauso = 2;
        double pi = 3.0;
        double tuso = 4.0;
        double esp = tuso/(mauso * (mauso + 1) * (mauso + 2)) - tuso/(((mauso + 2) * (mauso + 3) * (mauso + 4)));

        while (esp > saiso){
            pi += esp;
            mauso += 4;
            esp = tuso/(mauso * (mauso + 1) * (mauso + 2)) - tuso/(((mauso + 2) * (mauso + 3) * (mauso + 4)));
        }
        return pi + saiso;
    }
}
