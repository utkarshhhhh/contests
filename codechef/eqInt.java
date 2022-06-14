import java.util.*;
public class eqInt{

    public static int solve(int a , int b){
        
        if( a<=b ){
            return b-a;
        }
        
        int ans = (a-b)/2;
        b = b + 2*ans; 

        return ans + (a==b ? 0 : 2)  ;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            int x = scn.nextInt();
           
            System.out.println( solve(n,x) );
        }
        scn.close();
	}
    
}
