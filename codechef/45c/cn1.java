import java.util.Arrays;
import java.util.Scanner;

public class cn1 {

    public static int solver(int[] arr) {
        
        Arrays.sort(arr);

        long ans = 0, time = 1;

        for(int x : arr){

            ans += (int)Math.ceil( (x*1.0)/time );
            time++;

        }

        return (int)ans;
    }
    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println( solver(arr) );
        scn.close();
    }
}
