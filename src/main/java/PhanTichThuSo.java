public class PhanTichThuSo {
    public String phanTichThuaSo(int input){
        String output = "";

        if(input < 2)
            return output + input;
        for(int i = 2; i <= input; i++){
            while (input % i == 0){
                input /= i;
                if(input==1)
                    output += i;
                else
                    output += i + "*";
            }
        }
        return output;
    }
}
