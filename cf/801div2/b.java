import java.util.*;

public class b {

    public static String solve(int[] arr) {

        if (arr.length % 2 == 1) {
            return "Mike";
        }

        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] < arr[min] ){
                min = i;
            }
        }
        // System.out.println(arr[min]);
        return min%2!=0 ? "Mike" : "Joe" ;
    }

    public static boolean checkXMatrix(int[][] grid) {
        
        int n = grid.length;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                
                if( ( i==j || ( i+j == n-1 ) ) ){
                    if (grid[i][j]==0  ){
                        System.out.println("f");
                        return false;
                    }
                }else if( grid[i][j] != 0 ){
                    System.out.println("g");
                    return false;
                }
                
            }
        }
        return true;
    }

    public static int array(int[] nums1, int[] nums2) {
     
        
        int n = nums1.length;
        int[] n1 = new int[n], n2 = new int[n];
        
        int sum1 = 0, sum2 = 0; 
        for( int i= 0; i<n ; i++ ){
            sum1+=nums1[i];
            n1[i] = sum1;
            
            sum2+=nums2[i];
            n2[i] = sum2;
        }

        for (int i : n1) {
            System.out.print(i+" ");
        }
        System.out.println();

        for (int i : n2) {
            System.out.print(i+" ");
        }
        System.out.println();
        
        
        return 0;
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
        // Scanner scn = new Scanner(System.in);
        // int t = scn.nextInt();
        // while (t-- > 0) {
        //     int n = scn.nextInt();
        //     int[] arr = new int[n];
        //     for (int i = 0; i < n; i++) {
        //         arr[i] = scn.nextInt();
        //     }

        //     System.out.println(solve(arr));
        // }
        // scn.close();

        // int[][] grid = {{2,0,0,1},{0,3,1,0},{0,5,2,0},{4,0,0,2}};
        // System.out.println(checkXMatrix(grid) );

        // int[] nums1 = {60,60,60}, nums2 = {10,90,10};
        int[] nums1 = {1,2,3,4,5,6,1}, nums2 = {50,20,50,40,20};

            // array(nums1, nums2);
            maxScore( nums1 , 3);

            
            
    }

}
