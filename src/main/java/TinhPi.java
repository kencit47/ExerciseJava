public class TinhPi {
    public double tinhPi(){
        double saiso = 0.0001;
        double pi = 0;
        int mauso,doidau;
        double tuso = 4;
        mauso = doidau = 1;
        while((double)4/mauso > 0.0001)
        {
            pi+=(double)doidau*tuso;
            doidau = -doidau;
            mauso+=2;
            tuso = (double) 4 / mauso;
        }
        return pi+saiso;
    }
}
