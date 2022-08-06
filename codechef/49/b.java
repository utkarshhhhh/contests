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

	
	
	public static int helper(int n, int[] arr) {

		
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int x : arr){
			map.put(x, map.getOrDefault(x, 0)+1);
		}

		PriorityQueue<Integer> pq = new PriorityQueue<>( Collections.reverseOrder() );

		for (int x : map.values()) {
			pq.add(x);
		}

		if( pq.size() == 1 ){
			return (int)Math.ceil(1.0*pq.poll()/2);
		}

		// 1 1 2 2 2 2 2 
		int a = pq.poll();
		int b = pq.poll();

		if( a <= b*2 ){
			return b;
		}else{
			return (int)Math.ceil(1.0*pq.poll()/2);
		}

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
