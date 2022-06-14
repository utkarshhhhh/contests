import java.util.*;

public class f {

    public static boolean helper(int[] arr, int idx, int sum, int c) {
        
        
        if(sum%10 == 3 && c==3) return true;

        if( idx == arr.length || c>3 )
            return false;

        if( arr[idx] > 0 ){
            arr[idx]--;
            if( helper(arr, idx, sum+idx,c+1) ) return true;
            arr[idx]++;
        }
        return helper(arr, idx+1, sum,c);
    }

    public static boolean solve(int[] nums) {

        int[] hash = new int[10];
        
        for(int x : nums){
            hash[ x%10 ]++;
        }

        for(int i=0 ; i<10 ; i++){
            hash[i] = Math.min(hash[i], 3);
        }

        return helper(hash, 0, 0,0);
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here\
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            // int m = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = scn.nextInt();

            System.out.println(solve(arr)?"Yes" : "No");
        }
        scn.close();
    }

}
