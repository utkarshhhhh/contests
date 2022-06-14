import java.util.*;
public class chefwm {

    public static int row( int n ) {
        int count = 1;
        for(int i=2 ; i*i<=n ; i++){
        
            if(n%i == 0) count++;
            
            while(n%i==0){
                System.out.print(i+" ");
                n/=i;
            }
        }
    return count;
    }

    public static int col( int n ) {
        int count = 1;
        for(int i=2 ; i*i<=n ; i++){
        
            if(n%i == 0) count++;
            
        }
    //30 105
    // 2 3 5 7
    return count;
    }

    public static int solve(int n , int x, int y){
        
        int mid = (n+1)/2;
        
        int a = mid - x;
        int b = mid - y;
        
        a = a<0? -a : a;
        b = b<0? -b : b;

        int sum = a+b;

        return sum%2;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            int x = scn.nextInt();
            int y = scn.nextInt();
            System.out.println( solve(n,x,y) );
        }
        scn.close();
	}
    
}
