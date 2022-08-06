import java.io.*;
import java.util.*;

public class c {
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

	
	
	public static int helper(int n, int k, String s) {

		int z = 0, o = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == '0' ) z++;
			else o++;
		}

		// if( z==0 ){
		// 	// 1111
		// 	return (int) Math.ceil( (1.0*o)/k );
		// }

		// if( o==0 ){
		// 	// 1111
		// 	return (int) Math.ceil( (1.0*z)/k );
		// }

		// if( z==o ) return 0;

		int x = Math.abs(o-z);
		
		return (int) Math.ceil( (1.0*x)/k );
	}

	public static void main(String[] args)
	{
		FastReader s = new FastReader();
		int t = s.nextInt();
		while (t-- > 0) {
            
            int n = s.nextInt();
            int m = s.nextInt();
            // int x = s.nextInt();
            String st = s.nextLine();
            
            System.out.println( helper(n,m,st) );
		}
	}
}
