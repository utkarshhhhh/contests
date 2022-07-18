import java.util.*;
import java.io.*;

public class d {

    static int maxx = (int) 1e9 + 7;

    HashMap<Long, Long> map = new HashMap<>();

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here\
        FastReader scn = new FastReader();
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            // int y = scn.nextInt();
            int[] arr = new int[n+2];
            int[] lo = new int[n+2];
            int[] hi = new int[n+2];
            for (int i = 1; i <= n; i++) {
                lo[i] = scn.nextInt();
                hi[i] = scn.nextInt();
                int l = lo[i] , r = hi[i];
                arr[l] += 1;
                arr[r+1] -= 1
            }

            for (int j = 1; j <= n; j++) {
                arr[j] += arr[j-1];
            }

            ArrayList<Integer> ans = new ArrayList<>();

            for (int j = 1; j <= n ; j++) {
                                
                if( arr[j] == (n-1) ){

                    if( !( lo[j] <= j && hi[j] >= j ) ){
                        ans.add(j);
                    }

                }

            }

            for (Integer x : ans) {
                System.out.print( x + " " );
            }

            System.out.println();
        }
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                if (st.hasMoreTokens()) {
                    str = st.nextToken("\n");
                } else {
                    str = br.readLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}
