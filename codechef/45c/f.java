import java.util.*;
public class f{

    public static int solve(int n , long[] arr){
        
        int even = 0, odd = 0;
        for( int i=0 ; i<n ; i++ ){
            if( arr[i]%2 == 0 ) even++;
            else odd++;
        }

        if(even == odd) return 0;
        if( odd > even ) return odd - (n/2);

        // Arrays.sort(arr);

        ArrayList<Integer> list = new ArrayList<>();

        int ev = even - (n/2);

        for (int i = 0; i < arr.length; i++) {
            
            if( arr[i]%2 == 1 ) continue;
            int cur = 0;

            while (arr[i]%2 == 0) {
                cur++;
                arr[i] /= 2;
            }
            list.add(cur);
        }

        Collections.sort(list);

        int ans = 0;

        for (int i = 0; i < ev; i++) {
            ans += list.get(i);
        }

        return ans;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            long[] arr = new long[2*n];
            for (int i = 0; i < 2*n; i++) {
                arr[i] = scn.nextLong();
            }

            System.out.println( solve(2*n, arr) );
        }
        scn.close();
	}
    // 1 0 1 1 0 1
    // 1 1 1
}
