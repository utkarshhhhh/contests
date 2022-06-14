import java.util.*;
public class a{

    public static int solve(int a , int b, int c , int d){
        
        if( a>=c && a<=d ){
            return Math.max(a, c);
        }

        
        if( c>=a && c<=b ){
            return Math.max(a, c);
        }
        
        return a+c;
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
