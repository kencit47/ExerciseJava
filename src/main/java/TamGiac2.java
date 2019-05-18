public class TamGiac2 {
    public String tamGiac2(int x1, int y1, int x2, int y2, int x3, int y3){
        double chuvi;
        String result;
        String type;
        double canhAB = timCanhTamGiac(x1,y1,x2,y2);
        double canhBC = timCanhTamGiac(x2,y2,x3,y3);
        double canhAC = timCanhTamGiac(x1,y1,x3,y3);

        if(canhAB + canhAC > canhBC && canhAB + canhBC > canhAC && canhBC + canhAC > canhAB)
        {
            chuvi = canhAB + canhAC + canhBC;
            if(checkTamGiacVuong(canhAB,canhBC,canhAC)) {
                type = "Tam giac can";
            }else if(canhAB == canhBC || canhBC == canhAC || canhAB == canhAC) {
                type = "Tam giac vuong";
            }else {
                type = "Tam giac thuong";
            }
            result = "Type - chu vi - dien tich : " + type + " - " + chuvi + " - " + tinhDienTich(x1,y1,x2,y2,x3,y3);
        }else {
            return "Khong phai tam giac";
        }

        return result;
    }

    private double timCanhTamGiac(int x1, int y1, int x2, int y2){
        int x = x2 - x1;
        int y = y2 - y1;
        return Math.sqrt(x * x + y * y);
    }

    private double tinhDienTich(int x1, int y1, int x2, int y2, int x3, int y3){
        return (double) Math.abs((x2 - x1)*(y3 - y1) - (x3 - x1)*(y2 - y1))/2;
    }

    private boolean checkTamGiacVuong(double a, double b, double c){
            return (a * a == (b * b + c * c) || b * b == (a * a + c * c) || c * c == (a * a + b * b));
    }
}
