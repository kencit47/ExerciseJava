public class ChuyenLaMa {

    public int laMaToNhiPhan(String a){
        int result = 0;

        for (int i = 0; i < a.length(); i++){

            if(doiLaMa(a.charAt(i)) == 0)
                return -1;

            if(a.charAt(i) != a.charAt(a.length() - 1)) {
                if(doiLaMa(a.charAt(i)) < doiLaMa(a.charAt(i + 1)))
                    result -= doiLaMa(a.charAt(i));
                else
                    result += doiLaMa(a.charAt(i));
            }
            else
                result += doiLaMa(a.charAt(i));
        }

        return result;
    }

    private int doiLaMa(char a) {
        char[] arr = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
        int[] arrInt = {1, 5, 10, 50, 100, 500, 1000};

        for(int i = 0; i < arr.length; i++){
            if(a == arr[i]){
                switch (i){
                    case 0:
                        return arrInt[i];
                    case 1:
                        return arrInt[i];
                    case 2:
                        return arrInt[i];
                    case 3:
                        return arrInt[i];
                    case 4:
                        return arrInt[i];
                    case 5:
                        return arrInt[i];
                    default:
                        return arrInt[i];
                }
            }
        }
        return 0;
    }
}
