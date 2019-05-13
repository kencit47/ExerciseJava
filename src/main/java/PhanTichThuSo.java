public class PhanTichThuSo {
    public String PhanTichThuaSo(int input){
        String g_output = "";
        for(int i = 2; i <= input; i++){
            while (input % i == 0){
                input /= i;
                if(input==1)
                    g_output += i;
                else
                    g_output += i + "*";
            }
        }
        return g_output;
    }
}
