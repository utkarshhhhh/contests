import java.util.*;
public class a{

    public static int solve(int n , int x, int y, int z){
        
        int ans = 0;
        
        if(x>n) ans++;
        if(y>n) ans++;
        if(z>n) ans++;

        return ans;
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
