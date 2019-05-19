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
        int f;

        for(f = 1; n > 1; n--)
            f *= n;
        return f;
    }

    private int ncr(int n,int i) {
        return factorial(n) / ( factorial(n-i) * factorial(i) );
    }
}
