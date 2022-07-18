import java.util.*;
public class c2pep{

    public static long solve(int n , long[] arr){
        
        long ans = 0, sum = 0, neg = 0;

        PriorityQueue<Long> pq = new PriorityQueue<>();

        for( int i=0 ; i<n ; i++ ){
        
            if (arr[i] >= 0) {
                ans++;
                sum += arr[i];
            }else{

                if( Math.abs(neg + arr[i]) <= sum  ){

                    neg += arr[i];
                    pq.add(arr[i]);
                }else if( !pq.isEmpty() && arr[i] > pq.peek() ){
                    long rem = pq.poll();
                    neg = neg - rem + arr[i]; 
                    pq.add(arr[i]);
                }

            }
        }
        
        return ans + pq.size();
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = 1;
        while (t-->0) {
            int n = scn.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextLong();
            }

            System.out.println( solve(n, arr) );
        }
        scn.close();
	}
    // 1 0 1 1 0 1
    // 1 1 1
}
