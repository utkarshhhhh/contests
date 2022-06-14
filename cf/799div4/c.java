import java.util.*;

public class c {


    public static boolean check(String[] arr, int r, int c) {
        
        return r>=0 && r<8 && c>=0 && c<8 && arr[r].charAt(c) == '#';

    }

    public static String solve(String[] arr) {

        for(int i=0 ; i<8 ; i++){
            for(int j=0 ; j<8 ; j++){
            
                if( arr[i].charAt(j) == '#' ){
                    if( check( arr, i+1,j+1 ) && check( arr, i-1,j-1 ) && check( arr, i-1,j+1 ) && check( arr, i+1,j-1 ) ) 
                        return (i+1)+" "+(j+1);
                }   
            }
        }
        return "";
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here\
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            String[] arr = new String[8];
            for (int i = 0; i < 8; i++)
                arr[i] = scn.next();

            System.out.println(solve(arr));
        }
        scn.close();
    }

}
