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

	static int len;

	static int check(int idx, String m, int[] dp, String[] arr) {
		if (idx == len)
			return dp[idx] = 0;
		if (dp[idx] != 100000)
			return dp[idx];

		int ops = 100000;

		for (int i = 0; i < arr.length; i++)
		if (idx + arr[i].length() - 1 < len && m.substring(idx, arr[i].length()).equals(arr[i])){
			for (int k = 1; k <= arr[i].length(); k++) {
				ops = Math.min(ops, 1 + check(idx + k, m, dp, arr));
			}
			}

			return dp[idx] = ops;
		}
		
		public static void helper(String n, String[] arr) {
			
			int[] dp = new int[101];
			Arrays.fill(dp, 100000);
			len = n.length();
			
			int result = check(0, n, dp, arr);
			if (result == 100000) {
			for (int i=0 ; i<len ; i++)
				System.out.println(dp[i]);
			System.out.println(-1);
			return;
		} else {
			System.out.println(result);
			ArrayList<int[]> ans = new ArrayList<>();

			int idx = 0;

			while (idx < n.length()) {
				for (int i = 0; i < arr.length; i++) {
					boolean moved = false;
					if (idx + arr[i].length() - 1 < n.length() && n.substring(idx, arr[i].length()).equals( arr[i]) )
						for (int k = 1; k <= arr[i].length(); k++) {
							if (dp[idx] == 1 + dp[idx + k]) {
								moved = true;
								idx = idx + k;
								ans.add(new int[] { i, idx - k });
							}

							if (moved)
								break;
						}

					if (moved)
						break;
				}
			}

			for (int[] x : ans)
				System.out.println(x[0] + " " + x[1]);
		}
	}

	public static void main(String[] args) {
		FastReader s = new FastReader();
		int t = s.nextInt();
		while (t-- > 0) {

			String st = s.next();
			int n = s.nextInt();

			String[] arr = new String[n];
			// String st = s.nextLine();
			for (int i = 0; i < n; i++) {
				arr[i] = s.next();
			}
			helper(st, arr);
		}
	}
}
