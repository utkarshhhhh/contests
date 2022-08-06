import java.util.*;
import java.io.*;

public class b{

    public static void solve(int n , int[] arr){
        
        // int ans = 0;
        int[] hash = new int[n];
        int[] ans = new int[n];
        Arrays.fill(ans, 0);

        // 4 2 2 2 4 4 

        for(int i=1 ; i<n ; i++){

            int cur = arr[i];
            if( hash[cur] == 0 ){
                ans[cur]++;
            }else if( (i - hash[cur])%2 != 0 ){
                ans[cur]++;
            }
            hash[cur] = i;
        }

        for (int i = 1; i < ans.length; i++) {
            System.out.print(ans[i]+" ");            
        }
        // return 
    }
	public static void main (String[] args) throws java.lang.Exception
	{

		FastReader scn = new FastReader();
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            int[] arr = new int[n+1];
            for (int i = 1; i <= n; i++) {
                arr[i] = scn.nextInt();
            }
        
            solve(n+1,arr);
            System.out.println();
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
