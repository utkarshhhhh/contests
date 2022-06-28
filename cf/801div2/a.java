import java.util.*;
public class a{

    public static int solve(int[][] arr){
        
        int r=0, c = 0;
        int n = arr.length, m = arr[0].length;
        // int max = Integer.MIN_VALUE;

        for(int i=0 ; i<n ; i++){
            for (int j = 0; j < m; j++) {
                if( arr[i][j] > arr[r][c]  ){
                    // max = arr[i][j];
                    // System.out.println( arr[i][j] );
                    r = i;
                    c = j;
                }
            }
        }
        r++; c++;
        int nr = Math.max(r, n-r + 1);
        int nc = Math.max(c, m-c + 1);
        return nr*nc;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            int m = scn.nextInt();

            int[][] arr = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = scn.nextInt();
                }
            }

            System.out.println( solve(arr) );
        }
        scn.close();
	}
    
}
