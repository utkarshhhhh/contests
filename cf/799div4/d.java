import java.util.*;

public class d {

    public static boolean check(int h, int m) {
        
        int n = (h%10)*10 + h/10;
        return n == m;
    }

    public static int solve(int hh, int mm,int min) {

        int ans = 0;

        int h = min/60;
        int m = min%60;

        // int n = 1440/min;
        // if(check(hh, mm))   ans++;
        HashSet<Integer> set = new HashSet<>();
        while( !set.contains( hh*100 +mm ) ){
            
            set.add(hh*100+mm);
            hh += h;
            mm += m;
            
            if( mm >= 60 ){
                mm %= 60;
                hh++;
            }
            hh %= 24;
            // System.out.println( hh*100+mm);
            
            if(check(hh, mm))   ans++;
        }   

        return ans;
    }

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here\
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-- > 0) {
            // int n = scn.nextInt();
            String arr = scn.next();
            int min = scn.nextInt();
            int hh = Integer.parseInt( arr.substring(0,2) );
            int mm = Integer.parseInt( arr.substring(3) );
            
            // System.out.println(hh +" " + mm);

            System.out.println(solve(hh,mm, min));
        }
        scn.close();
    }

}
