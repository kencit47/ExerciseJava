public class Arr_4_SapXepMang {

    public String sapXepMang(int[] a){
        String result = "";
        // Dua so chan sang ben trai , so le sang ben phai
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] % 2 == 0)
                continue;
            for(int k = i + 1; k < a.length; k++){
                if(a[k] % 2 == 0){
                    int temp = a[i];
                    a[i] = a[k];
                    a[k] = temp;
                }
            }
        }
        // Sap xep so chan tang dan
        for(int i = 0; a[i] % 2 == 0; i++){

            for(int k = i + 1; a[k] % 2 == 0; k++){
                if(a[i] > a[k]){
                    int temp = a[i];
                    a[i] = a[k];
                    a[k] = temp;
                }
            }
        }
        // Sap xep so le giam dan
        for(int i = a.length - 1; a[i] % 2 != 0; i--){

            for(int k = i - 1; a[k] % 2 != 0; k--){
                if(a[i] > a[k]){
                    int temp = a[i];
                    a[i] = a[k];
                    a[k] = temp;
                }
            }
        }
        for(int i : a)
            result += i + " ";

        return result.trim();
    }
}
