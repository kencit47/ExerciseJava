public class TamGiac {
    public String tamGiac(int a, int b, int c) {
        String type = "";
        int chuvi;
        double dientich;
        String result;

        if(a + b <= c || b + c <= a || a + c <= b){
            return "Khong phai tam giac";
        }else {
            chuvi = a + b + c;
            dientich = Math.sqrt((a + b + c)*(a + b - c)*(b + c - a)*(c + a - b))/4;
            if(a == b && a == c && b == c) {
                type = "Tam giac can";
            }else if(a * a == (b * b + c * c) || b * b == (a * a + c * c) || c * c == (a * a + b * b)) {
                type = "Tam giac vuong";
            }else {
                type = "Tam giac thuong";
            }
            result = "Type - chu vi - dien tich : " + type + " - " + chuvi + " - " + dientich;

        }

        return result;
    }
}
