import java.util.*;
import java.io.*;

public class d {

    static int maxx = (int)1e9+7;

    HashMap<Long, Long> map = new HashMap<>();

    static long power(int x, long y) {
        long temp;
        x = 2;
        if (y == 0)
            return 1;
        temp = power(x, y / 2)%maxx ;
        if (y % 2 == 0)
            return (temp * temp)%maxx;
        else
            return (  ((x * temp)%maxx) * temp)%maxx;
    }

    public static long solve(int n, int[] arr) {

        long ans = 0;
        HashMap<Integer, Long> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0L) + 1);
        }

        for (Long i : map.values()) {

            if (i > 1) {
                ans += ( power(2, i) - i - 1) % 1000000007;
            }
            // System.out.println(i);
        }

        return ans;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here\
        FastReader scn = new FastReader();
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            // int y = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
            System.out.println(solve(n, arr));
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
