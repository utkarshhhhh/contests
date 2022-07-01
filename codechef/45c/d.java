import java.util.*;
public class d{

    public static String solve(int n , long[] arr){
        
        long sum = 0;
        for( int i=0 ; i<n ; i++ ){
            sum += arr[i];
        }
        sum = sum/(n+1);
        for (int i = 0; i < n; i++) {
            System.out.print( arr[i] - sum + " " );
        }

        return "";
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextLong();
            }

            System.out.println( solve(n, arr) );
        }
        scn.close();
	}
    // 1 0 1 1 0 1
    // 1 1 1
}
