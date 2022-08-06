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

	public static long helper(int n , int[] arr) {

		long ans = 0;

		// long[] hash = new long[n];
		
		// for (int i : arr) {
		// 	hash[i]++;
		// }
		// // int prev = 0;
		// for(int i=1 ; i<n ; i++){
			
		// 	// hash[i] -= ans;

		// 	if( hash[i] <= 0 )continue;

		// 	long cur = (int)Math.ceil( ( (i+hash[i])/hash[i]) ) ;

		// 	ans += cur;
		// }
		
		Arrays.sort(arr);
		for( int i=1 ; i<n ; i++ ){
			// System.out.print(arr[i] + " ");
			if( arr[i] < i )
			// ans += ( (i+arr[i]) / arr[i] );
			ans = Math.max(ans,(int) Math.ceil( i*1.0/arr[i] )  );
		}

		return ans==0 ? 1 : ans;
	}

	public static void main(String[] args)
	{
		FastReader s = new FastReader();
		int t = s.nextInt();
		while (t-- > 0) {
            
            int n = s.nextInt();
            int[] arr = new int[n+1];
			for (int i = 1; i <= n; i++) {
				arr[i] = s.nextInt();
			}
            System.out.println( helper(n+1, arr) );
		}
	}
}
