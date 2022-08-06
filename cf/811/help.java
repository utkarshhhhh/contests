import java.util.*;
import java.io.*;

class solution {

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

    static int mod = (int)1e9+7;
    
    public static long helper(int x){
        
        long[] ans = { 8, 10, 18 };
        if(x <= 3){
            return ans[x-1];
        }
        long c = 8, b = 10, a = 18;

        for( int i=3 ; i<x ; i++  ){
            long temp = ( a%mod + b%mod + c%mod )%mod;
            
            c = b;
            b = a;
            a = temp;
        }
        
        return a;
    }

    public static void main(String[] args) {

        FastReader sc = new FastReader();
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            
            System.out.println( helper(n) );
        }
    }
}