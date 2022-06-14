import java.util.*;
public class pathPar{

    public static String solve(int a , int b){
        
        return (a%2==0)?"Yes" : b==1 ? "Yes" : "No"  ;
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
