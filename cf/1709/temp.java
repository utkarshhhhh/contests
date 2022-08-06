import java.util.*;
public class a{

    public static int solve(int n , int x, int y, int z){
        
        if( n - x-y >= z ){
            return 0;
        }

        // int max =Math.max(x, y);
        
        if( n - x >= z || n - y >= z ){
            return 1;
        }

        return 2;
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
