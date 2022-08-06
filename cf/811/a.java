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

	public static void main(String[] args)
	{
		FastReader s = new FastReader();
		int t = s.nextInt();
		while (t-- > 0) {
            
            int n = s.nextInt();
            int am = s.nextInt();
            int ax = s.nextInt();
            int tot = am*60 + ax;
            

            int ans = 10000000, min = 10000000;

            for (int i = 0; i < n; i++) {
                int h = s.nextInt();
                int m = s.nextInt();

                int cur = h*60 + m;
                int curr = cur - tot;

                if( curr >=0 ){
                    ans = Math.min(ans, curr);
                }
                min = Math.min(min, curr);
            }
            
            if( ans != 10000000 ){
                
                System.out.println( ans/60 + " " + ans%60 );
            }else{
                min += 24*60;
                System.out.println( min/60 + " " + min%60 );
            }

		}
	}
}
