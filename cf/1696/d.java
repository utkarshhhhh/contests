import java.util.*;
import java.io.*;
/**
 * a
 */
public class d {

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;
  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
  
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
  
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
  
        String nextLine()
        {
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }


    public static void makeGraph(int[] arr, ArrayList<ArrayList<Integer>> graph) {
    
        int n = arr.length;
        int[][] min = new int[n][n];
        int[][] max = new int[n][n];

        for (int i = 1; i < max.length; i++) {
            max[i][i] = arr[i-1];
            min[i][i] = arr[i-1];
        }


        // for (int i = 0; i < max.length; i++) {
        //     for (int j = 0; j < max.length; j++) {
        //         min[i][j] = Math.min(min[i-1][j], Math.min( min[i][j-1], arr[i]) );
        //     }
        // }

        Arrays.fill(min[0], Integer.MAX_VALUE);

        for(int gap = 1 ; gap<n ; gap++){

            for(int i = 1,j=i+gap ;j<n ; j++, i++){
                min[i][j] = Math.min(min[i+1][j], Math.min( min[i][j-1], arr[i]) );
                max[i][j] = Math.max(max[i+1][j], Math.max( max[i][j-1], arr[i]) );
            }
        }

        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr.length ; j++){
                
                if( (i!=j) &&  ( (min[i][j] == arr[i] && max[i][j] == arr[j]) || ( max[i][j] == arr[i] && min[i][j] == arr[j] ) ) ){
                    graph.get(i).add(j);
                    System.out.println("ubfef");
                    graph.get(j).add(i);
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            
            for (int j = 0; j < graph.get(i).size(); j++) {
                System.out.print( graph.get(i).get(j) );
            }System.out.println();
        }

    }

    public static int bfs( ArrayList<ArrayList<Integer>> graph, int s, int p ) {
        
        Queue< Integer > q = new LinkedList<>();
        q.add(s);
        int time = 1;
        boolean[] vis = new boolean[graph.size()];

        while( q.size() > 0 ){

            int si = q.size();
            for(int i=0 ; i<si ; i++){

                int cur = q.poll();
                vis[cur] = true;
                for( Integer nbr : graph.get(cur) ){

                    if (!vis[nbr]) {
                        continue;
                    }

                    if( nbr == p ) return time;
                    q.add(nbr);
                }
            }
            time++;
        }
        return time;
    }

    public static int solve(int[] arr) {

        // Arrays.sort(arr);
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            graph.add(new ArrayList<>());
        }
        makeGraph( arr, graph );
        

        return bfs(graph, 0, arr.length-1 );
    }

    public static void main(String[] args) {
        FastReader scn = new FastReader();
        int t = scn.nextInt();

        while (t-- > 0) {
            int n = scn.nextInt();
            // long z = scn.nextLong();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt() - 1;
            }

            System.out.println(solve(arr));
        }
    }
}