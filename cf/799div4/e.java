import java.util.*;

public class e {


    public static int solve(int[] nums, int x) {

        int n = nums.length;
        // int sum = Arrays.stream(nums).sum();
        
        // find max Length of subarray that sums to sum-x;
        int targetSum = x, ans = -1;
        int cur = 0;
        
        for(int l=0 , r=0 ; r<n ; r++){
            
            cur += nums[r];
            
            while( l<=r &&  cur > targetSum ){
                cur -= nums[l++];
            }
            
            if( cur == targetSum ){
                ans = Math.max(ans, r-l+1);
            }
        }
        
        return ans==-1 ? -1 : n-ans;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here\
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int m = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = scn.nextInt();

            System.out.println(solve(arr, m));
        }
        scn.close();
    }

}
