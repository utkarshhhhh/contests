import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class e {
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

	
	
	public static int helper(int n, int[] arr) {

		ArrayList<Integer> a = new ArrayList<>();
		HashSet<Integer> map = new HashSet<>();
		for (int q = 1; q < 10; q++) {
			
			int x = q;
			a = new ArrayList<>();
			map.clear();;
			System.out.println( x );
			while ( !map.contains(x%10) ) {
				System.out.print(x +" ");
				map.add(x%10);
				a.add(x%10);
				x += x%10;
	
			}
	System.out.println();
			for (Integer i: a) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}

		return 0 ;
	}

	public static void main(String[] args)
	{
		FastReader s = new FastReader();
		int t = s.nextInt();
		while (t-- > 0) {
            
            int n = s.nextInt();
            int[] arr = new int[n];
            // String st = s.nextLine();
            for (int i = 0; i < n; i++) {
				arr[i] = s.nextInt();
			}
            System.out.println( helper(n,arr) );
		}
	}
}
