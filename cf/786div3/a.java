import java.util.Scanner;

public class a{

    public static void solve(int a, int b) {
        
        int x = 0 ,y = 0;

        if( b%a == 0  ){
            y = b/a;
            x = 1;
        }
                
        System.out.println( x + " " + y );
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            solve(scn.nextInt() , scn.nextInt());
        }
        scn.close();
    }
}