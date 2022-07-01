import java.util.*;
public class c{

    public static String solve(int n , int[] arr){
        
        int y = arr[0]==1 ? 1 : 0 ;
      int x = y;

        for( int i=0 ; i<n-1 ; i++ ){
            if( arr[i] == 1 ){
                if( x==1 ){
                    x = 0;
                }else x = 1;
            }
        }


        if( arr[n-1] == 1 ){
            return (x + y)%2 != 0  ? "Yes" : "No";
        }else{
            return (x + y)%2 == 0  ? "Yes" : "No";
        }

        // return next == ans ? "Yes" : "No";
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }

            System.out.println( solve(n, arr) );
        }
        scn.close();
	}
    // 1 0 1 1 0 1
    // 1 1 1
}
