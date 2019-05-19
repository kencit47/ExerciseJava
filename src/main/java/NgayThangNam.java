public class NgayThangNam {

    public String ngayConLaiCuaThang(int day, int month, int year){
        String result = "";

        if(!checkDateInvalid(day,month,year))
            return "Invalid date";
        result += dayOfMonth(month,year) - day;

        return result;
    }

    public String ngayConLaiCuaNam(int day, int month, int year){
        String result = "";
        int date = 0;
        if(!checkDateInvalid(day,month,year))
            return "Invalid date";

        for(int i = month + 1; i <= 12; i ++){
            date += dayOfMonth(i,year);
        }
        date += dayOfMonth(month,year) - day;
        result += date;

        return result;
    }

    public String thuCuaNgay(int day, int month, int year){
        if(!checkDateInvalid(day,month,year))
            return "Invalid date";
        switch (soNgayTuDauNam1990(day, month, year) % 7) {
            case 1: return "Thu 2";
            case 2: return "Thu 3";
            case 3: return "Thu 4";
            case 4: return "Thu 5";
            case 5: return "Thu 6";
            case 6: return "Thu 7";
            default: return "Chu Nhat";
        }
    }

    private int soNgayDaTroiQuaTrongNam(int day, int month, int year) {
        int result = 0;

        for(int i = 1; i <= month - 1; i++) {
            result += dayOfMonth(i,year);
        }
        result += day;

        return result;
    }

    private int soNgayTuDauNam1990(int day, int month, int year){
        return (year - 1990) * 365 + soNgayDaTroiQuaTrongNam( day, month, year);
    }
    private boolean checkDateInvalid(int d, int m, int y){
        return (d >= 1 && d <= 31 && m >= 1 && m <= 12 && y >= 1990 && y<= 3000);
    }

    private int dayOfMonth(int month, int year){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return  31;
            case 2:
                if(year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
                    return  29;
                else
                    return  28;
            default:
                return  30;
        }
    }
}
