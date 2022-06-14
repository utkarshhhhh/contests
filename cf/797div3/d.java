import java.util.*;
public class d{

    public static int solve(int n, int k, String s){
        
        int min = n;

        int cur = 0;

        for (int i = 0; i < k; i++) {
            if( s.charAt(i) == 'W' ){
                cur++;
            }
        }
        min = Math.min(min, cur);

        for( int i=k ; i<s.length() ; i++ ){

            if( s.charAt(i-k) == 'W' ){
                cur--;
            }
            
            if( s.charAt(i) == 'W' ){
                cur++;
            }
            min = Math.min(min, cur);
        }

        return min;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            int k = scn.nextInt();
            String str = scn.next();
            System.out.println(solve(n,k, str));
        }
        scn.close();
	}
    
}
