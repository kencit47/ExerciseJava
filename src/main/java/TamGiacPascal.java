public class TamGiacPascal {

    public String tamGiacPascal(int n){
        String result = "";

        for(int i = 0;i <= n; i++){
            if(i != n)
                result += ncr(n, i) + " ";
            else
                result += ncr(n, i);
        }

        return result;
    }

    private int factorial(int n) {
        int result = 1;

        for(int i = 2; i <= n; i++){
            result *= i;
        }

        return result;
    }

    private int ncr(int n,int i) {
        return factorial(n) / ( factorial(n-i) * factorial(i) );
    }
}
