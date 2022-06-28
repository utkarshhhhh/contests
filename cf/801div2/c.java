import java.util.*;
public class c{

    public static String help(String s) {
        
        StringBuilder sb = new StringBuilder();

        int m = s.length() /2;

        for(int i=0 ; i<m ; i++){
            sb.append(s.charAt(i));
            sb.append(s.charAt(m+1+i));
        }

        String finalStr = sb.toString();
        String tok = "pycar8gq729";

        Set<Character> set = new HashSet<>();
        
        for(char c : tok.toCharArray() )
            set.add(c);

        StringBuilder ans = new StringBuilder();

        for(char c : finalStr.toCharArray() )
            if( !set.contains(c) )
                ans.append(c);

        return ans.toString();
    }

    public static boolean isPallin(String s){

        int i=0 , j = s.length()-1;

        while( i<=j ){

            if( s.charAt(i++) != s.charAt(j--) ){   
                return false;
            }
        }
        return true;
    }


    public static int longestCommonSubsequence(String a, String b) {
        if(a.equals(b)){
            return a.length();
        }
           int dp[][]= new int [a.length()+1][b.length()+1];
        for(int i=1;i<=a.length();i++){
            for(int j=1;j<=b.length();j++){
                if(a.charAt(i-1)==b.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return (dp[a.length()][b.length()]);
        }
    }

    public static String check( String s ) {
        
        if( isPallin(s)  ) return s;

        StringBuilder sb = new StringBuilder( s );
        sb.reverse();
        int lc = lcs( s, sb.toString()  );



        return s;
        // kaayk
        // kayak
    }

    public static boolean helper( int[][] arr, int sum, int r, int c ) {
        
        if( r>=arr.length || c>=arr[0].length ){
            return false;
        }
        
        sum += arr[r][c];
        if( r==arr.length-1 && c==arr[0].length-1 ){
            return sum == 0;
        }

        // int left = helper(arr, sum, r+1, c);
        // int right = helper(arr, sum, r, c+1);
        boolean left = helper(arr, sum, r+1, c);
        if (left) {
            return true;
        }
        return helper(arr, sum, r, c+1);
    }

    public static String solve(int[][] arr){
        
        // int n = arr.length, m = arr[0].length;
        // int max = Integer.MIN_VALUE;

        return helper(arr, 0, 0, 0) ? "Yes" : "No";
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        // int t = scn.nextInt();
        // while (t-->0) {
        //     int n = scn.nextInt();
        //     int m = scn.nextInt();

        //     int[][] arr = new int[n][m];
        //     for (int i = 0; i < n; i++) {
        //         for (int j = 0; j < m; j++) {
        //             arr[i][j] = scn.nextInt();
        //         }
        //     }

        //     System.out.println( solve(arr) );
        // }

        System.out.println(help( "123hg*aaabb" ));
        
        scn.close();
	}
    
}
