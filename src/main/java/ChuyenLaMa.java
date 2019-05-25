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

        for(int i = 0; i < arr.length; i++){
            if(a == arr[i]){
                switch (i){
                    case 0:
                        return 1;
                    case 1:
                        return 5;
                    case 2:
                        return 10;
                    case 3:
                        return 50;
                    case 4:
                        return 100;
                    case 5:
                        return 500;
                    default:
                        return 1000;
                }
            }
        }
        return 0;
    }
}
