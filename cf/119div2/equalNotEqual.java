import java.util.Scanner;

public class equalNotEqual{

    public static String solve(String str) {
        
        int i=0 , n = str.length();
        while ( i<n && str.charAt(i) == 'E' ) {
            i++;
        }        
        
        if ( i==n-1 && str.charAt(i) == 'N' ) {

            return "NO";
        }

        int j=0; boolean flag = false;
        if (str.charAt(j) == 'N' ) {
            j++;
            flag = true;
        } 
        
        while ( j<n && str.charAt(j) == 'E' ) {
            j++;
        } 
        
        if( j==n && flag)
        return "NO";

        return "YES";
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            System.out.println( solve(scn.next()) );
        }
        scn.close();
    }
}