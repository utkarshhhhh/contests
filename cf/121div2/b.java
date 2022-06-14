import java.util.Scanner;

public class b{

    public static int compare(String s1, String s2) {
        
        int n1= s1.length() , n2 = s2.length();
        if( n1 > n2 ){
            return 1;
        }else if (n2>n1) {
            return -1;
        }

        for (int i = 0; i < n1; i++) {
            if(s1.charAt(i) != s2.charAt(i))
                return s1.charAt(i)-s2.charAt(i);
        }

        return 0;
    }
    public static String solve(String str) {
        
        //StringBuilder s = new StringBuilder();

        int n = str.length();
        
        String ans = "";
        //int idx = -1 , sum = -1;
        for (int i = 0; i < n-1; i++) {

            int a = str.charAt(i)-'0' , b = str.charAt(i+1)-'0';
            int sum = a+b;
            String cuss = str.substring(0, i) + sum + str.substring(i+2);  
            if( compare( cuss, ans) > 0 ){
                ans = cuss;
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