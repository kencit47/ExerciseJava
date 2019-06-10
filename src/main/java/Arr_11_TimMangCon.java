public class Arr_11_TimMangCon {
    public String timMangCon(int[] a){
        String result = "";
        int z = a.length - 1;
        int x = a.length - 1;

        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                for(int k = z; k != i && k >= i; k--){
                     if(a[k] % 2 == 0) {
                         int temp = a[i];
                         a[i] = a[k];
                         a[k] = temp;
                         z = k-1;
                         break;
                     }
                }
            }else {
                for(int k = x; k != i && k >= i; k--){
                     if(a[k] % 2 != 0){
                        int temp = a[i];
                        a[i] = a[k];
                        a[k] = temp;
                         x = k-1;
                        break;
                    }

                }
            }
        }

        for(int i : a)
            result += i;
        return result;
    }
}
