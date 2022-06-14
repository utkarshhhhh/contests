import java.util.*;

public class b {

    public static int solve(int[] arr,int n) {

        int u = 0; // unique

        Set<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);    
        }

        u = set.size();

        int rem = n-u;

        if (rem%2 != 0) {
            u -= 1;
        }

        return u;
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
            System.out.println(solve(arr, n));
        }
        scn.close();
    }

}
