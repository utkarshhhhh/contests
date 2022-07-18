import java.util.*;
public class b{

    public static String solve(int n){
        
        int[] ans = new int[n];

        int x = n;
        for (int i = 0; i < n ; i+=2) {
            ans[i] = x--;
        }

        x = 1;
        for (int i = 1; i < n ; i+=2) {
            ans[i] = x++;
        }

        for (int i : ans) {
            System.out.print( i + " " );
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
            // int x = scn.nextInt();
            // int y = scn.nextInt();
            System.out.println( solve(n) );
        }
        scn.close();
	}
    
}
