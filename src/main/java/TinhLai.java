public class TinhLai {
    public int tinhLaiNganHang(int n){
        int tiengoc= 100;

        for(int i = 0; i < n; i++){
            tiengoc += tiengoc*(100/n)/100;
        }
        return tiengoc;
    }
}
