import java.io.*;
import java.util.*;

public class d {
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

	
	
	public static long helper(int n, int[] arr) {

		
		HashMap<Integer, Integer> map = new HashMap<>();
		HashMap<Integer, Integer> map = new HashMap<>();

		long sum = 0;
		for(int x : arr){
			sum += x;
			map.put(x, map.getOrDefault(x, 0)+1);
		}

		PriorityQueue<long[]> pq = new PriorityQueue<>( (a,b)->{
			return (int)(b[0] - a[0]);
		});

		for (int x : map.keySet()) {
			pq.add( new long[]{ x, map.get(x) } );
		}

		int ans = 0;
		while (pq.size() != 1) {
			long[] a = pq.poll();
			long[] b = pq.poll();
			
			if( (n-a[1])*b[0] <= sum ){
				// check
				n -= a[1];
				sum -= a[0]*a[1];
				long pep = (long)Math.ceil( ( Math.abs(1.0*sum - n*a[0]))/a[0] );

				if( pep <= a[1] ){
					return ans+pep;
				}else{
					ans += a[1];
					return ans;
				}
				// sum += a[0]*a[1];
			}else{
				n -= a[1];
				ans += a[1];
				pq.add(b);
			}

			// ans += 0;

		}
		// 5 1 4 1
		return ans;
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
