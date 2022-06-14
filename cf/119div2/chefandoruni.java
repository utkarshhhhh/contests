import java.util.*;

public class chefandoruni {

    public static int solve(int[] arr) {

        int[] ar = new int[12];
        for (int i :arr) {
            int c = 0;
            while( i>0 ){
                if( (i&1) == 1)
                    ar[ c ]++;
                i = i>>1; c++; 
            }
        }
        int ans = 0 , ab = 1;
        for (int i = 0; i < 12 ; i++) {
            if(ar[i] > 1) {
                ans = ans|ab;
            } ab<<=1;
        }
        return ans;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here\
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = scn.nextInt();
            System.out.println(solve(arr));
        }
        scn.close();
    }
}
