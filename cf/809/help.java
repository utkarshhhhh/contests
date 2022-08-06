import java.util.*;
import java.io.*;

public class help{

    public static int solve(int n , int[] arr){
        
        int one = 0;

        for (int i = 0; i < arr.length; i++) {
            if( arr[i] == 1 ){
                one = i;
                break;
            }
                
        }

        // left;

        int l = one;

        while( --l>=0 ){
            if( arr[l] == 2 ){
                break;
            }
        }

        // right
        int r = one;
        while( ++r < n ){
            if( arr[r] == 2 ){
                break;
            }
        }

        if( l==-1 && r==n ){
            return 0;
        }else if( l==-1 ){
            return r-one;
        }else if( r==n ){
            return one-l;
        }else{
            return Math.min( r-one, one-l );
        }

    }
	public static void main (String[] args) throws java.lang.Exception
	{

		FastReader scn = new FastReader();
        // int t = scn.nextInt();
        // while (t-->0) {
        //     int n = scn.nextInt();
        //     // int m = scn.nextInt();
        //     int[] arr = new int[n];
        //     for (int i = 0; i < n; i++) {
        //         arr[i] = scn.nextInt();
        //     }
        
        //     System.out.println( solve(n,arr); );
        // }

        int[] arr = { 2, 0, 0, 0, 0 ,0 ,1 };
         System.out.println( solve( arr.length , arr) );

	}

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
  
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
  
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
  
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    
}
