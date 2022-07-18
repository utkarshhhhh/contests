/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class b
{
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

	public static int helper(int[] arr) {

		HashMap<Integer, Integer> map  = new HashMap<>();
		int max  = 0, maxC = 0;
		for (int i : arr) {
			max = Math.max(max, i);
			map.put(i, map.getOrDefault(i, 0) +1 );	
		}

		int ans = 0;
		for (int key : map.values()) {
			maxC = Math.max(key, maxC);
			if( map.get(key) == 1 ) ans++;
		}

		if( ans%2 == 1 ){
			ans = (ans+1)/2;

			if(map.get(max) == 1){
				if (maxC == 2) {
					ans++;
				}
			}
			return ans;
		}
		else 
		return ans/2;
	}

	public static void main(String[] args)
	{
		FastReader s = new FastReader();
		int t = s.nextInt();
		while (t-- > 0) {
            
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            System.out.println( helper(arr) );
		}
	}
}
