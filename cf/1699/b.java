import java.util.*;
public class b{

    public static String solve(int[][] arr ){
        
        int[][] mat = { {0,1,1,0}, {0,1,1,0}, { 1,0,0,1 }, { 1,0,0,1} };
        int f = 0, c = 0;

        for (int i = 0; i+1 < arr.length; i+=2) {

            f = c%2;

            for (int j = 0; j+1 < arr[0].length; j+=2) {

                if( f==0 ){
                    arr[i][j] = 1;
                    arr[i+1][j] = 0;
                    arr[i][j+1] = 0;
                    arr[i+1][j+1] = 1;
                }else{
                    arr[i][j] = 0;
                    arr[i+1][j] = 1;
                    arr[i][j+1] = 1;
                    arr[i+1][j+1] = 0;
                }
                f = 1-f;
            }
            c++;
        }

        for (int[] is : arr) {
            for (int x : is) {
                System.out.print(x + " " );
            }
            System.out.println();
        }
        
        return "";
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            // int n = scn.nextInt();
            int x = scn.nextInt();
            int y = scn.nextInt();
            System.out.println( solve( new int[x][y] ) );
        }
        scn.close();
	}
    
}
