import java.util.*;

public class test {
    static long solution(String a, String b) {

        int n = a.length(), m = b.length(), maxx = Integer.MAX_VALUE;
        HashMap<Character, TreeSet<Integer>> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        
        for(char c='a' ; c<='z' ; c++){
            map.put( c, new TreeSet<>() );
            map.get(c).add(maxx);
        }
        
        for(int i=0 ; i<n ; i++){
            map.putIfAbsent( a.charAt(i), new TreeSet<>() );
            set.add( a.charAt(i) );
            map.get(a.charAt(i)).add(i);
        }
        
        int maxLen = 0, curMax = 0 ;
        for(int i=0 ; i<m ; i++){
            
            char c = b.charAt(i);
            
            if ( !set.contains( c ) )
                return -1;

            int cur = map.get(c).ceiling( curMax );
            
            if( cur == maxx ){
                maxLen += n;
                cur = map.get(c).ceiling( 0 );
            }            
            curMax = cur + 1;
        }
        
        return maxLen + curMax;
    }
    
    public static void main(String[] args) {

        String a = "contest", b = "sonn";
    System.out.println(a + " " + b);
        System.out.println( solution(a, b ) );        
    }
}
