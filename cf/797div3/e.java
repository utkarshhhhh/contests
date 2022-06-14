import java.util.*;
public class e{

    public static int solve(int[] a, int k){
        
        TreeSet<Integer> map = new TreeSet<>();
        
        for( int i : a ){
            map.add(i);
        }

        int ans = 0;
        for(int i=0 ; i<a.length ; i++){
            
            if( map.contains(a[i]) ){
                ans += (a[i] + map.ceiling(k-a[i]) )/k;

                map.remove(a[i]);
                map.remove(map.ceiling(k-a[i]));
            }
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
            int k = scn.nextInt();
            int[] a = new int[n];
        
            for(int i=0 ; i<n ; i++)
                a[i] = scn.nextInt();
                
            System.out.println( solve(a,k) );
            
        }
        scn.close();
	}
    
}
