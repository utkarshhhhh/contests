import java.util.*;
public class a{

    public static void solve(int n){
        
        if( n%3 == 0 ){
            System.out.println( n/3 + " " + (n/3 +1) + " " + (n/3 - 1) );
        }else{

            int x = n%3;
            n /= 3;
            if( x==1 ){
                System.out.println( n + " " + (n + x +1) + " " + (n - 1) );
            }else{
                System.out.println( (n+1) + " " + (n + x ) + " " + (n - 1) );
            }

        }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
             solve(n);
        }
        scn.close();
	}
    
}
