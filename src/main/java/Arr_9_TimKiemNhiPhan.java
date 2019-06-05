public class Arr_9_TimKiemNhiPhan {

    public int timKiemNhiPhan(int index, int[] a){
        int first = 0;
        int end = a.length;
        int mid;

        while (first != end){
            mid = (first + end)/2;
            if(a[mid] == index)
                return mid;
            if(a[mid] < index)
                first = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}
