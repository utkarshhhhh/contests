import java.util.Scanner;

public class a{

    public static String solve(String str) {
        
        int n = str.length();
        int[] hash = new int[26];
        for (int i = 0; i < n; i++) {
            hash[ str.charAt(i)-'a' ]++;
        }
        
        String ans = "";
        for (int i = 0; i < 26; i++) {
            if(hash[i] == 2){
                ans += (char)(i+'a');
                hash[i] = 0;
            }
        }
        ans = ans.concat(ans);

        for (int i = 0; i < 26; i++) {
            if(hash[i] == 1){
                ans += (char)(i+'a');
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            System.out.println( solve(scn.next()) );
        }
        scn.close();
    }
}