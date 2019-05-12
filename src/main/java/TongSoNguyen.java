public class TongSoNguyen {
    public int TimTongSoNguyen(int a){
        int result = 0;
        if(a < 10)
            return a;
        while (a > 0)
        {
            result += a % 10;
            a /= 10;
        }
        return result;
    }
}
