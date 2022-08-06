import java.util.*;
import java.io.*;
public class d{

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


    static int MAX = 500;
 
    // lookup[i][j] is going to store index
    // of minimum value in arr[i..j].
    // Ideally lookup table size should not be fixed
    // and should be determined using n Log n.
    // It is kept constant to keep code simple.
    static int[][] lookup = new int[MAX][MAX];
 
    // Structure to represent a query range
    static class Query {
        int L, R;
 
        public Query(int L, int R)
        {
            this.L = L;
            this.R = R;
        }
    };
 
    // Fills lookup array lookup[][]
    // in bottom up manner.
    static void preprocess(int arr[], int n)
    {
        // Initialize M for the intervals
        // with length 1
        for (int i = 0; i < n; i++)
            lookup[i][0] = i;
 
        // Compute values from smaller
        // to bigger intervals
        for (int j = 1; (1 << j) <= n; j++)
        {
            // Compute minimum value for
            // all intervals with size 2^j
            for (int i = 0;
                 (i + (1 << j) - 1) < n;
                 i++)
            {
                // For arr[2][10], we compare
                // arr[lookup[0][3]]
                // and arr[lookup[3][3]]
                if (arr[lookup[i][j - 1]]
                    < arr[lookup[i + (1 << (j - 1))]
                                [j - 1]])
                    lookup[i][j] = lookup[i][j - 1];
                else
                    lookup[i][j]
                        = lookup[i + (1 << (j - 1))][j - 1];
            }
        }
    }
 
    static int query(int arr[], int L, int R)
    {
        int j = (int)Math.log(R - L + 1);
 
        if (arr[lookup[L][j]]
            <= arr[lookup[R - (1 << j) + 1][j]])
            return arr[lookup[L][j]];
 
        else
            return arr[lookup[R - (1 << j) + 1][j]];
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		FastReader scn = new FastReader();
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = n - scn.nextInt();
        }

        preprocess(arr, m);

        int size = scn.nextInt();
        for (int i = 0; i < size; i++) {
            int a1 = scn.nextInt();
            int b1 = scn.nextInt();
            int a2 = scn.nextInt();
            int b2 = scn.nextInt();
            int x = scn.nextInt();

            int a = Math.abs( a1-a2 )%x;
            int b = Math.abs( b1-b2 )%x;
            if( a%x != 0 || b%x != 0 ){
                System.out.println("NO");
            }else{
                int min = query(arr, Math.min(b1, b2)-1, Math.max(b1, b2)-1);

                if( min> a%x && min > b%x ){
                    System.out.println("Yes");
                }

            }

        }
        System.out.println( query(arr, 2, 4) );
	}
    
}
