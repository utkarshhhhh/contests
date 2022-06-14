import java.util.Scanner;

public class b{

    public static void solve(String str) {
        
        char a = str.charAt(0) , b = str.charAt(1);
        int ans = 0 ;

        ans = 25 *( a - 'a' ) + b - 'a' + 1;

        // System.out.println( y );

         ans += b>a?  -1 : 0;
        
                
        System.out.println( ans );
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
           solve( scn.next() );                    
        }
        scn.close();
    }
}