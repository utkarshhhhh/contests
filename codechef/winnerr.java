import java.util.*;
public class winnerr{

    public static String solve(int n , int x, int y, int z){
        
        int a = Math.max(n,x);
        int b = Math.max(y,z);
        
        return a==b ? "TIE" : a<b ? "P" : "Q";
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            int x = scn.nextInt();
            int y = scn.nextInt();
            int z = scn.nextInt();
            System.out.println( solve(n,x,y,z) );
        }
        scn.close();
	}
    
}
