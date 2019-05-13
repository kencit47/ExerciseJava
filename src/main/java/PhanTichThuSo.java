public class PhanTichThuSo {
    public String hamPhanTichThuaSo(int Input){
        String Output = "";

        if(Input < 2)
            return Output + Input;
        for(int i = 2; i <= Input; i++){
            while (Input % i == 0){
                Input /= i;
                if(Input==1)
                    Output += i;
                else
                    Output += i + "*";
            }
        }
        return Output;
    }
}
