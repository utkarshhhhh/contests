import java.util.*;
public class b{

    public static String solve(int x, int y){
        
        // a,b,c
        // ab = x,  bc = y, ac = xy
        int z = x^y;

        int a = 2 , b, c;

        if( x%2 != 0 && y%2 != 0 ){

            b = 2^x ; c = 2^y;
            
            if( b > c )
            System.out.print( 2 + " " + c + " " + b);
            else
            System.out.print( 2 + " " + b + " " + c);
        }else if( x%2 == 0 ){

            // c = 2;
            c = 2^y ; //  c = b 
            b = x^c;
            
            if( b > c )
            System.out.print( 2 + " " + c + " " + b);
            else
            System.out.print( 2 + " " + b + " " + c);


        }else {

            // c = 2;
            b = 2^x ; 
            c = y^b;
            
            if( b > c )
            System.out.print( 2 + " " + c + " " + b);
            else
            System.out.print( 2 + " " + b + " " + c);


        }

        return "";
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            int m= scn.nextInt();
            System.out.println( solve(n,m) );
        }
        scn.close();
	}
    
}
