import java.io.*;
import java.util.*;

public class a {
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

	
	
	public static boolean helper(int a, int b, int c) {

		if (a==b && a==c) return true;
		
		return (a==b && a<c )|| (b==c && b<a) || (a==c && a<b);

		// return check(str, end/2) &&  helper(str, end/2);
	}

	public static void main(String[] args)
	{
		FastReader s = new FastReader();
		int t = s.nextInt();
		while (t-- > 0) {
            
            int n = s.nextInt();
            int m = s.nextInt();
            int x = s.nextInt();
            // String st = s.nextLine();
            
            System.out.println( helper(n,m,x) ? "Yes" : "No" );
		}
	}
}
