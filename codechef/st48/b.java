import java.io.*;
import java.util.*;

public class b {
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

	public static int helper(int n , int m) {

		if( n%2 == 0 && m%2 == 0 ){
			return 0;
		}else if( n%2 == 0 ){
			return n;
		}else if ( m%2 == 0 ){
			return m;
		}else{

			/*
			 * 	111
			 *  111
			 *  111
			 */			
			return n+m - 1;
		}

	}

	public static void main(String[] args)
	{
		FastReader s = new FastReader();
		int t = s.nextInt();
		while (t-- > 0) {
            
            int n = s.nextInt();
            int m = s.nextInt();
            
            System.out.println( helper(n,m) );
		}
	}
}
