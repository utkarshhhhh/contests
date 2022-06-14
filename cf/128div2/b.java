import java.util.*;
public class b{

    public static boolean solver(int[][] arr) {
        
        ArrayList<int[]> q = new ArrayList<>();

        for(int i=0 ; i<arr.length ; i++){

            for (int j = 0; j < arr[0].length; j++) {
                if( arr[i][j] == 1 ){
                    q.add(new int[]{i,j});
                    break;
                }
            }
        }

        if (q.size()==0) {
            return false;
        }

        Collections.sort(q, (a,b) -> {
            return a[0]-b[0];
        } );

        // System.out.println(q.toString() +  " -------------- ");

        int[] row = q.get(0);
        
        Collections.sort(q, (a,b) -> {
            return a[1]-b[1];
        } );
        // System.out.println(q.toString() +  " -------------- ");
        
        int[] col = q.get(0);

        int up1 = row[0] , left1 = row[1];
        int up2 = col[0] , left2 = col[1];

        // System.out.println(up1 + " " + left1 + " " +up2 + " "+left2 + " ");

        return (up1>=up2 && left1>=left2) || (up1<=up2 && left1<=left2);
    }

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            int m = scn.nextInt();
            int[][] arr = new int[n][m];

            for( int i=0 ; i<n ; i++ ){
                String[] s = scn.next().split("");
                
                // for (String string : s) {
                //     System.out.print(string + " ");
                // }
                // System.out.println();
                for(int j=0 ; j<m ; j++){
                    arr[i][j] = s[j].equals("E")?0:1;                    
                }

            }
            
            // for (int[] a : arr) {
            //     for (int b : a) {                    
            //         System.out.print(b);
            //     }
            //     System.out.println();
            // }

            System.out.println( solver(arr)?"Yes":"No" );
        }
        scn.close();
	}
    
}
