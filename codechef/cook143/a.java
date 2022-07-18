import java.util.*;
public class a{

    public static String solve(int n){
        
        if (n == 3) {
            return "-1";
        }

        for (int i = Math.min(10, n); i >= 5 ; i--) {
            System.out.print( i + " ");
        }

        System.out.print( 1 +" " + 2 + " " + 4 + " " + 3 + " " );

        for (int i = 11; i <= n; i++) {
            System.out.print(i + " ");
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
