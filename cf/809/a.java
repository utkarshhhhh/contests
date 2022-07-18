import java.util.*;
import java.io.*;
public class a{

    public static String solve(int n , int[] arr){
        
        if( n==2 ){
            return "Yes";
        }


        return (arr[1]%arr[0] == 1)|| arr[1] == 1 || arr[0] == 1? "Yes" : "No";
    }
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            System.out.println( solve(n,arr) );
        }
        scn.close();
        

	}
    
}
