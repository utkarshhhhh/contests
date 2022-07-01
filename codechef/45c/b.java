import java.util.*;
public class b{

    public static int solve(int n , int x, int y, int z){
        
        if( n!=y && x!=z )
            return 1;

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
    // 1 0 1 1 0 1
    // 1 1 1
}
