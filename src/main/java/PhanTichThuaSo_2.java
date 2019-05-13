public class PhanTichThuaSo_2 {
    public String hamPhanTichThuaSo(int Input){
        String Output = "";
        if(Input < 2)
            return Output + Input;
        for(int i = 2; i <= Input; i++){
            int count = 0;
            while (Input % i == 0){
                Input /= i;
                count++;
            }
            if(count != 0){
                if(count == 1){
                    if(Input == 1)
                        Output += i;
                    else
                        Output += i + "*";
                }
                else {
                    if(Input == 1)
                        Output += i + "^" + count;
                    else
                        Output += i + "^" + count + "*";
                }
            }
        }
        return Output;
    }
}
