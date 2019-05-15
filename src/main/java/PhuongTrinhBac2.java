public class PhuongTrinhBac2 {
    public String phuongTrinhBac2(int a, int b, int c){
        double x1,x2;
        String result = "";
        if(a + b + c == 0)
        {
            result += "a + b + c = 0 : 2 nghiem x1 = 1; x2 = c/a";
            return result;
        }
        if(a - b + c == 0)
        {
            result += "a - b + c = 0 : 2 nghiem x1 = -1; x2 = -c/a";
            return result;
        }
        int delta = b*b - 4*a*c;
        if(delta < 0)
        {
            result += "Delta < 0 : Vo nghiem";
            return result;
        }
        if(delta == 0)
        {
            result += "Delta = 0 :nghiem kep x1 = x2 = -b/a";
            return result;
        }
        x1 = (-b + Math.sqrt(delta))/(2*a);
        x2 = (-b - Math.sqrt(delta))/(2*a);
        result += "Delta > 0 : x1 = " + x1 + ";" + "x2 = " + x2;
        return result;
    }
}
