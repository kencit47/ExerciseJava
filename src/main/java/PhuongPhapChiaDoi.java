public class PhuongPhapChiaDoi {

    public double phuongPhapChiaDoi(double a){
        double result = 0.0;
        double canduoi = 0.0;
        double cantren = a;

        while ((cantren - canduoi) > 0.0001) {
            result = (cantren + canduoi) / 2;
            if (result * result - a < 0)
                canduoi = result;
            else
                cantren = result;
        }
        return result;
    }

}