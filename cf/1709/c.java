import java.util.*;
public class c{

    public static String solve(String s){
        
        String yes = "YES";
        String no = "NO";
        
        int c = 0 , o = 0, q = 0;
        for (int i = 0; i < s.length(); i++) {
            if( s.charAt(i)=='(' ) o++;
            else if( s.charAt(i) == ')' ) c++;
            else q++;
        }
        int d = q - Math.abs(o-c);
        // ()???)()()
        return d>2 ? no : yes;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            String s = scn.next();
            System.out.println( solve(s) );
        }
        scn.close();
	}
    
}
