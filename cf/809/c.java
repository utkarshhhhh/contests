import java.util.*;
import java.io.*;

public class c {

    public static void solve(int n , int[] arr){
        
        long ans = 0;
        // 1 2 3 4 5 6 7 
        if(n % 2 == 1){
           for(int i = 1 ; i < n; i += 2){
               ans += (Math.max(arr[i - 1], arr[i + 1]) - arr[i] < 0) ? 0 : Math.max(arr[i - 1], arr[i + 1]) - arr[i] + 1;
           }
        }else{
            long ans1 = 0;
           for(int i = 1 ; i < n - 1; i += 2){
               ans1 += (Math.max(arr[i - 1], arr[i + 1]) - arr[i] < 0) ? 0 : Math.max(arr[i - 1], arr[i + 1]) - arr[i] + 1;
           }
   
           long ans2 = 0;
           for(int i = 2 ; i < n - 1; i += 2){
               ans2 += (Math.max(arr[i - 1], arr[i + 1]) - arr[i] < 0) ? 0 : Math.max(arr[i - 1], arr[i + 1]) - arr[i] + 1;
           }
   
           long ans3 = Integer.MAX_VALUE;
        //    if(n == 6){
               ans3 = 0;
               for(int i = 1; i < n - 1; i += 3){
                    ans3 += (Math.max(arr[i - 1], arr[i + 1]) - arr[i] < 0) ? 0 : Math.max(arr[i - 1], arr[i + 1]) - arr[i] + 1; 
               }
           
   
           ans = Math.min(ans1, ans2);
           ans = Math.min(ans, ans3);
           
        }
        System.out.println(ans);
        // return 
    }

    public static void main(String[] args) throws java.lang.Exception {

        FastReader scn = new FastReader();
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }

            solve(n, arr);
            // System.out.println( );
        }
        // scn.close();

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
