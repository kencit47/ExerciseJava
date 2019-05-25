public class PhanTichThuaSo_2 {
    public String phanTichThuaSo(int input){
        String output = "";
        if(input < 2)
            return output + input;
        for(int i = 2; i <= input; i++){
            int count = 0;
            while (input % i == 0){
                input /= i;
                count++;
            }
            if(count != 0){
                if(count == 1){
                    if(input == 1)
                        output += i;
                    else
                        output += i + "*";
                }
                else {
                    if(input == 1)
                        output += i + "^" + count;
                    else
                        output += i + "^" + count + "*";
                }
            }
        }
        return output;
    }
}
