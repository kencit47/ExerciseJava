public class thapPhanSangLama {

    public String thapPhanSangLaMa(int a){
        String result = "";
        int[] arr = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] arrLM = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

            for(int i = 0; true; i++){
                if(a - arr[i] >= 0){
                    a -= arr[i];
                    result += arrLM[i];
                    i = 0;
                }
                if(a == 0)
                    return result;
        }
    }
}
