import java.util.*;
public class isPar{

    public static String solve(int a , int b){
        
        if( b==1 ) return (a%2)==0 ? "Even" : "Odd";
        if( b==2 ) return "Odd";
        

        return "Even";
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            int x = scn.nextInt();
           
            System.out.println( solve(n,x) );
        }
        scn.close();
	}
    
}
