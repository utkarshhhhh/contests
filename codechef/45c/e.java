import java.util.*;
public class e{

    public static int solve(int n , int a, int b){
        
        int ans = 0;
        boolean flag = true;
        for (int i = n-1; i >= 0; i--) {
            
            int cur = 1<<i;

            if( (a&cur) > 0 && (b&cur) > 0  ){
                continue;
            }else if( (a&cur) == 0 && (b&cur) == 0  ){
                ans |= cur;
            }else {

                if(flag){

                    if( (cur&a)==0 && (cur&b)>0 ){
                        flag = false;
                    }else{
                        flag = false;
                        ans |= cur;
                    }

                }else {

                    if( (cur&a)==0 && (cur&b)>0 )
                        ans |= cur;

                }

            }

        }

        // System.out.println( (a^ans)*(b^ans) + " ef");

        return ans;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            int a = scn.nextInt();
            int b = scn.nextInt();
            
            System.out.println( solve(n, a, b) );
        }
        scn.close();
	}
    // 1 0 1 1 0 1
    // 1 1 1
}
