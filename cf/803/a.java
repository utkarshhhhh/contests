import java.util.*;

public class a {

    public static int solve(int[] arr) {

        return arr[0];
    }

    public static void maxScore(int[] cardPoints, int k) {
        
        // find n-k min subarray
                
        int cur = 0, n = cardPoints.length;
        k = n-k;
        for(int left = 0 ; left<k ; left++ ){
            cur += cardPoints[left];
        }
        
        int ans = cur, sum = cur;
        
        for(int left = k, r = 0 ;  left<n ; left++, r++ ){
            
            cur += cardPoints[left];
            cur -= cardPoints[r];
            
            sum += cardPoints[left];
            
            ans = Math.min(ans, cur);        
        }
        
        System.out.println( sum - cur );
    }


    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here\
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }

            System.out.println(solve(arr));
        }
        scn.close();

            
    }

}
