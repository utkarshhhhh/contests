import java.util.*;
public class a{

    public static int solve(String s){
        
        int z = 0, o = 0;
        int n = s.length();
        
        int i = 0;
        while( i < n ){
            if( s.charAt(i) == '1' ) break;
            i++;
        }

        for ( ; i < s.length(); i++) {            
            // if( msb==-1 && s.charAt(i) == '1' ) msb = i;
            if( i>0 && s.charAt(i) == '0' && s.charAt(i-1) != '0' ) z++;
            else if( i>0 && s.charAt(i-1) != '1' ) o++;
        }

        // System.out.println( o + "  " + z );

        for ( int j= n-1 ; j>=0 ; j--) {            

            if( s.charAt(j) == '1' ) o--;
            else break;
        }

        // System.out.println( o + "  " + z );


        return Math.abs(z) ;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            String str = scn.next();
             System.out.println( solve(str) );
        }
        scn.close();
	}
    
}
