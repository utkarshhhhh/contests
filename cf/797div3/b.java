import java.util.*;
public class b{

    public static String solve(int[] a, int[] b){
        
        int dif = 0;
        for(int i=0 ; i<a.length ; i++){        
            dif = Math.max(a[i] - b[i], dif);
        }

        for(int i=0 ; i<a.length ; i++){

            if( b[i] == Math.max(a[i]-dif, 0) ){
                continue;
            }else{
                return "No";
            }
        }

        return "Yes";
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];

            for(int i=0 ; i<n ; i++)
                a[i] = scn.nextInt();
                
            for(int i=0 ; i<n ; i++)
                b[i] = scn.nextInt();

            System.out.println( solve(a,b) );
        }
        scn.close();
	}
    
}
