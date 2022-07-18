import java.util.Scanner;

public class inf2 {
    
    public static int solver(int n) {
        
        if( n==0 ) return 0;

        int ans = 0;
        boolean found = false;
        while( n>0 ){

            if( n%2 == 0 ){
                found = true;
                break;
            }
            n /= 10;
            ans++;
        }

        return found ? ans : -1;
    }

    public static int solve(int n, int[] arr) {
        
        // int n = arr.length, m = arr[0].length;
        
        int p = 0;
        for (int is : arr) {
            p += solver(is);
        }
        return p;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        // int m = scan.nextInt();
        int[] arr= new int[n];

        for (int i = 0; i < n; i++) {
            // for (int j = 0; j < m; j++) {
                arr[i] = scan.nextInt();
            // }
        }

        System.out.println( solve(n,arr) );
        scan.close();
    }
}
