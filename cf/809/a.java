import java.util.*;

public class a{

    public static void solve(int n ,int m, int[] arr){
        
        char[] ans = new char[m];
        Arrays.fill(ans, 'B');
        for (int i = 0; i < arr.length; i++) {
            // 1 1 1 1 1
            int idx1 = arr[i]-1, idx2 = m - arr[i];

            if( idx1 > idx2 ){
                int temp = idx1;
                idx1 = idx2;
                idx2 = temp;
            }

            if( idx1<m && ans[idx1] == 'B'){
                ans[idx1] = 'A';
            }else if( idx2<m && ans[idx2] == 'B'){
                ans[idx2] = 'A';
            }
        }

        System.out.println(ans);
        // return 
    }
	public static void main (String[] args) throws java.lang.Exception
	{

		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            int m = scn.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }
        
            solve(n,m,arr);
            // System.out.println(  );
        }
        scn.close();
        

	}
    
}
