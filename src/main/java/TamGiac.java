public class TamGiac {
    public String tamGiac(int a, int b, int c) {
        String type = "";
        int chuvi;
        String result;

        if(a + b <= c || b + c <= a || a + c <= b){
            return "Khong phai tam giac";
        }else {
            chuvi = a + b + c;
            if(a == b || b == c || a == c) {
                type = "Tam giac can";
            }else if(checkTamGiacVuong(a,b,c)) {
                type = "Tam giac vuong";
            }else {
                type = "Tam giac thuong";
            }
            result = "Type - chu vi - dien tich : " + type + " - " + chuvi + " - " + dienTichTamGiac(a,b,c);

        }

        return result;
    }

    private double dienTichTamGiac(int a, int b, int c){
        return Math.sqrt((a + b + c)*(a + b - c)*(b + c - a)*(c + a - b))/4;
    }

    private boolean checkTamGiacVuong(int a, int b, int c){
        if(a * a == (b * b + c * c))
            return true;
        if(b * b == (a * a + c * c))
            return true;
        if(c * c == (a * a + b * b))
            return true;
        return false;
    }
}
