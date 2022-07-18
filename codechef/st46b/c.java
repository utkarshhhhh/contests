import java.util.*;
public class c{

    
    public static String solve(String s){
        
        Set<Character> hash = new HashSet<>();
        hash.add('a');hash.add('e');hash.add('i');hash.add('o');hash.add('u');
        
        ArrayDeque<int[]> list = new ArrayDeque<>();
        ArrayDeque<int[]> ls = new ArrayDeque<>();

        for(int i=0 ; i<s.length() ; i++){
            if( i > 1 && hash.contains( s.charAt(i) ) ){
                list.add( new int[] { 0, i-1 } );        
            }
        }

        int max = 0;
        while( list.size() > 0 ){

            int[] x = list.poll();

            if( list.size()%2 == 0 ){
                if( ls.size()==0 ) ls.add( new int[] { x[1], 0 });
                else ls.addFirst( new int[]{ x[1], max+1 } );
            }else{

                if( ls.size()==0 ) ls.add( new int[] { 0, x[1] });
                else ls.addLast( new int[] { max+1, x[1] } );
            }
            max = Math.max(max, x[1] );
        }

        if( max < s.length() ){
            ls.addLast( new int[] { max+1, s.length()-1 } );
        }

        StringBuilder sb = new StringBuilder();
        for (int[] is : ls) {
            
            System.out.println( is[0] + " " + is[1] );
            if( is[0] <= is[1]){
                for (int i = is[0]; i <= is[1]; i++) {
                    sb.append(s.charAt( i ));
                }
            }else {

                for (int i = is[0]; i >= is[1]; i--) {
                    sb.append( s.charAt(i) );
                }
            }
            
            // System.out.println( sb.toString() );
        }        
        return sb.toString() ;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            String str = scn.next();
             System.out.println( solve(str) );
        }
        scn.close();
	}
    
}
