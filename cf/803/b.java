import java.util.*;

public class b {

    public static int solve(int[] arr, int k) {

        return (arr.length-1)/2;
        //
        // 1 2 3 4 5 6
        // 1 2 3 4 5 6 7
        // 1 2 3 4 5 6 7 8 
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here\
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int k = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }

            System.out.println(solve(arr, k));
        }
        scn.close();

            
    }

}
