import java.util.*;
public class d{

    static int gcd(int a, int b){

        if(b==0) return a;
        return gcd(b, a%b);
    }
    public static int solve(int[] arr){
     
        int ans = 0;
        for(int i=1 ; i<=arr.length ; i++){
            ans = gcd(ans, Math.abs(arr[i-1]-i));
        }
        return ans ;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            int[]  arr = new int[n];
            for(int i=0 ; i<n ; i++) arr[i] = scn.nextInt();
             System.out.println( solve(arr) );
        }
        scn.close();
	}
    
}
