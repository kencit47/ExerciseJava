public class Arr_4_SapXepMang {

    public int sapXepMang(int[] a){

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
        String s = "";
        for(int i : a)
            s += i;
        System.out.println(s);
        return 0;
    }
}
