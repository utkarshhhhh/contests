import java.io.*;
import java.util.*;

public class h {
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

	
	
	public static void helper(int[] arr, int d) {

		for (int x = 0; x < d; x++) {
			int[] narr = new int[arr.length];
			for (int i = 0; i < arr.length; i++) {
				if( i==0 ){
					narr[i] = arr[i+1]==0 ? 0 : 1 ;
				}else if( i==arr.length-1 ){
					narr[i] = arr[i-1]==0 ? 0 : 1 ;
				}else{
					narr[i] = arr[i+1]==arr[i-1] ? 0 : 1;
				}
			}
			arr = narr;
		}
		for (int i : arr) {
			System.out.print( i + " ");
		}
	}

	public static void main(String[] args)
	{
		int[] arr = {1,0,0,0,0,1,0,0};
    	helper(arr,1);
	}
}
