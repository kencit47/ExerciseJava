public class Arr_1_SoXuanHien2Lan {

    public String findNumber(int[] a){
        String result = "";
        int[] arrInt = {0,1,2,3,4,5,6,7,8,9};

        for(int i : arrInt){
            int count = 0;
            for(int k : a){
                if(i == k)
                    count++;
            }
            if(count > 1)
                result += i + " ";
        }

        return  result.trim();
    }
}
