import java.util.*;
import java.io.*;
/**
 * a
 */
public class b {

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

    public static int solve(int[] arr) {

        // Arrays.sort(arr);

        boolean b = false;
        int count = 0;
        for (int l : arr) {
            
            if( l==0 ){
                b = false;
            }else{
                if( !b ) count++;
                b = true;
            }

        }

        return count <= 1 ? count : 2;
    }

    public static void main(String[] args) {
        FastReader scn = new FastReader();
        int t = scn.nextInt();

        while (t-- > 0) {
            int n = scn.nextInt();
            // long z = scn.nextLong();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }

            System.out.println(solve(arr));
        }
    }
}