import java.io.*;
import java.util.*;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;

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

	public static class Node {		
		int val;
		Node node;
		boolean xor = false;
		ArrayList<Node> adj;

		Node( int v ){
			// node = n;
			val = v;
			adj = new ArrayList<>();
		}
	}

	public static void helper(int n , int[] par, int m) {

		// int[] apr = 

		HashMap<Integer, Node> graph = new HashMap<>();

		for(int i=0 ; i<n ; i++){
			graph.put(i, new Node(0) );
		}

		for(int i=1 ; i<n ; i++){
			graph.get( par[i] ).adj.add( graph.get(i) ) ;
		}
		count = m;
		dfs( graph.get(0) , graph );

		for(int i=0 ; i<n ; i++){
			System.out.print( graph.get(i).val );
		}
		
	}


	static int count;

	static void dfs(Node s, HashMap<Integer, Node> g ){

		if( s.adj.size() == 0 ){
			return ;
		}

		int p = 0;
		for( Node n : s.adj ){

			dfs(n, g);

			if( count>0 && !s.xor){	
				n.val = 1;
				count--;
				// p++;
				s.xor = true;
			}
		}

	}


	public static void main(String[] args)
	{
		FastReader s = new FastReader();
		int t = s.nextInt();
		while (t-- > 0) {
            
            int n = s.nextInt();
            int m = s.nextInt();
            int[] arr = new int[n];
			for (int i = 1; i < n; i++) {
				arr[i] = s.nextInt() - 1;
			}
            helper(n, arr, m);
			System.out.println();
		}
	}
}
