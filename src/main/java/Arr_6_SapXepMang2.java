public class Arr_6_SapXepMang2 {
    public String sapXepMang2(int[] a){
        String result = "";

        for(int i = 0; i < a.length - 1; i++){
            for(int k = i + 1; k < a.length; k++){
                if(a[i] % 2 == 0){
                    if(a[k] % 2 == 0 && a[i] > a[k]){
                        int temp = a[i];
                        a[i] = a[k];
                        a[k] = temp;
                    }
                }else {
                    if(a[k] % 2 != 0 && a[i] < a[k]){
                        int temp = a[i];
                        a[i] = a[k];
                        a[k] = temp;
                    }
                }
            }
        }
        for(int  i : a)
            result += i + " ";

        return result.trim();
    }
}
