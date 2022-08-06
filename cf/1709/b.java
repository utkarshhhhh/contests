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

	public static int helper(int n , int m) {

		if( n%2 == 0 && m%2 == 0 ){
			return 0;
		}else if( n%2 == 0 ){
			return n;
		}else if ( m%2 == 0 ){
			return m;
		}else{

			/*
			 * 	111
			 *  111
			 *  111
			 */			
			return n+m - 1;
		}

	}

	public static void main(String[] args)
	{
		FastReader s = new FastReader();
	   
        int n = s.nextInt();
        int m = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            
            long[] pre = new long[n];
            long[] post = new long[n];

            long left = 0;
            for( int i=1 ; i<n ; i++ ){
                if( arr[i] < arr[i-1] ) 
                left += arr[i-1] - arr[i];
                pre[i] = left;
            }

            long right = 0;
            for( int i=n-2 ; i>=0 ; i-- ){
                if( arr[i] < arr[i+1] ) 
                right += arr[i+1] - arr[i];
                post[i] = right;
            }
            
            // for (long x : pre) {
            //     System.out.print( x  + " ");
            // }
            // System.out.println();
            
            // for (long x : post) {
            //     System.out.print( x  + " ");
            // }
            // System.out.println();
            

            for (int i = 0; i < m; i++) {
                
                int x = s.nextInt() ;
                int y = s.nextInt() ;

                if( x < y ){
                    System.out.println( pre[y-1] - pre[x-1] );
                }else{
                    System.out.println( post[y-1] - post[x-1] );
                }
            }

	}
}
