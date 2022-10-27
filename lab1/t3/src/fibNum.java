public class fibNum {
    private static long[] arr = new long[92];
    private static int last = 2;
    static {
        arr[0] = 1;
        arr[1] = 1;
    }
    public static long fibNum(int n) {
        for (int i = last; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        return arr[n - 1];
    }
}
