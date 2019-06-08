public class Arr_10_ChiaMang {
    public String chiaMang(int n, int[] a){
        String result = "";
        int index = a.length % n == 0? a.length / n : a.length / (n - 1);

        for(int i = 0; i < a.length; i++){
            if((i + 1) % index == 0)
                result += a[i] + " ";
            else
                result += a[i];
        }
        return result;
    }
}
