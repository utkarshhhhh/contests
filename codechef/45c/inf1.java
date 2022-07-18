import java.util.Scanner;

public class inf1 {
    
    public static int profit(int[] arr) {
        
        int ans = 0, max = Integer.MIN_VALUE;
        for( int x : arr ){            
            ans = Math.max(ans, x + max);
            max = Math.max(max, -x );
        }
        return ans;
    }

    public static int solve(int[][] arr) {
        
        int n = arr.length, m = arr[0].length;
        int[][] ar = new int[m][n]; 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ar[j][i] = arr[i][j];
            }
        }
        int p = 0;
        for (int[] is : ar) {
            p += profit(is);
        }
        return p;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] arr= new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scan.nextInt();
            }
        }

        System.out.println( solve(arr) );
        scan.close();
    }
}
