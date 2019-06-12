import java.util.Arrays;

public class Arr_12_ChenSoVaoMang {
    public String chenSoVaoMang(int index , int[] a){
        String result = "";
        int[] b = Arrays.copyOf(a,a.length + 1);

        for(int i = 0 ; i < b.length - 1; i++){
            if(index >= a[a.length - 1]){
                b[b.length - 1] = index;
                break;
            }

            if(index < a[0]){
                System.arraycopy(a,0,b,1,a.length);
                b[0] = index;
                break;
            }

            if(index < a[a.length - 1 - i] && index >= a[a.length - 2 - i]){
                b[b.length - 1 - i] = b[b.length - 2 - i];
                b[b.length - 2 - i] = index;
                break;
            }
            else {
                b[b.length - 1 - i] = b[b.length - 2 - i];
            }
        }

        for(int i : b){
            result += i + " ";
        }

        return result.trim();
    }
}
