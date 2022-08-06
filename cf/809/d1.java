import java.util.*;
import java.io.*;

public class d1{

    public static int solve(int n ,int k, int[] arr){
        
        if( k==1 ){
            Arrays.sort(arr);
            return arr[n-1] - arr[0];
        }

        int[] ans 
        // int ans = 0;
        
        // 4 2 2 2 4 4 

        for(int i=1; i<n ; i++){

        }

        // return 
    }
	public static void main (String[] args) throws java.lang.Exception
	{

		FastReader scn = new FastReader();
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            int m = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i <= n; i++) {
                arr[i] = scn.nextInt();
            }
        
            System.out.println( solve(n,k,arr); );
        }

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
