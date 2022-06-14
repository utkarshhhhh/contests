import java.util.Scanner;

public class c{

    public static int solve(String a, String b) {
        
        if( b.equals("a") ){
            return 1;
        }
        int x = a.length() ,y = b.length();

        for (int i = 0; i < b.length(); i++) {
            if( b.charAt(i) == 'a' ){
                return -1;
            }
        }
     
        // System.out.println( x + " " + y );
        return 1<<x;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            System.out.println( solve(scn.next() , scn.next()) );
        }
        scn.close();
    }
}