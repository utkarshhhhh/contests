import java.util.*;
public class a{

    public static String solve(int n){
        

        if( n%2==0 ){
            System.out.print( "0 " + n/2 + " " + n/2 );
        }else {
            return "-1";
        }
        // 7
        // 2 2 1
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
