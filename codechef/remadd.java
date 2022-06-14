import java.util.*;

public class remadd {

    public static int solve(int[] arr) {
        
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here\
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = scn.nextInt();
            System.out.println(solve(arr));
        }
        scn.close();
}
