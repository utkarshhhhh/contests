import java.util.*;
/**
 * a
 */
public class a {

    public static long solve(long[] arr ,long z) {
        
        // Arrays.sort(arr);

    long max = 0;

    for (long l : arr) {
        max = Math.max(max, l|z);
    }

        return max;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        
        while (t-- > 0) {
            int n = scn.nextInt();
            long z = scn.nextLong();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }

            System.out.println(solve(arr, z));
        }
        scn.close();
    }
}