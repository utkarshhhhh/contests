import java.util.*;
public class c{

    public static void solve(int[] a, int[] b){
        
        System.out.print(b[0]- a[0] + " ");
        
        for(int i=1 ; i<a.length ; i++){
            System.out.print( (b[i]- Math.max(a[i], b[i-1]) )+ " ");
        }

    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for(int i=0 ; i<n ; i++)
                a[i] = scn.nextInt();
                
            for(int i=0 ; i<n ; i++)
                b[i] = scn.nextInt();
                solve(a,b);
            System.out.println();
        }
        scn.close();
	}
    
}
