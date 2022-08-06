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

	public static String helper(String str, int n) {

		int z = 0, o = 0;

		for( char c : str.toCharArray() ){
			if( c=='0' ) z++;
			else o++;
		}
		String ans = "";

		int x = n/2;

		if( o >= x   ){
			for (int i = 0; i < o; i++) {
				ans += '0';
			}

		}else {


			for (int i = 0; i < o; i++) {
				ans += '1';
			}

		}
		return ans;
	}

	public static void main(String[] args)
	{
		FastReader s = new FastReader();
		int t = s.nextInt();
		while (t-- > 0) {
            
            int n = s.nextInt();
            String st = s.nextLine();
            
            System.out.println( helper(st,n) );
		}
	}
}
