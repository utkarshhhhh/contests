import java.util.*;
public class a{

    public static String solve(int n , int x, int y, int z){
        
        String yes = "Yes";
        String no = "No";
        
        if( n == 1 ){
            if( x == 0 ){
                return no;
            }else{
                if( x==2 ){
                    if( y == 0 ){
                        return no;
                    }else{
                        return yes;
                    }
                }

                if( z == 0 ){
                    return no;
                }else{
                    return yes;
                }

            }
        }

        if( n == 2 ){
            if( y == 0 ){
                return no;
            }else{
                if( y==1 ){
                    if( x == 0 ){
                        return no;
                    }else{
                        return yes;
                    }
                }

                if( z == 0 ){
                    return no;
                }else{
                    return yes;
                }

            }
        }

        if( n == 3 ){
            if( z == 0 ){
                return no;
            }else{
                if( z==2 ){
                    if( y == 0 ){
                        return no;
                    }else{
                        return yes;
                    }
                }

                if( x == 0 ){
                    return no;
                }else{
                    return yes;
                }

            }
        }

        

        return yes;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            int n = scn.nextInt();
            int x = scn.nextInt();
            int y = scn.nextInt();
            int z = scn.nextInt();
            System.out.println( solve(n,x,y,z) );
        }
        scn.close();
	}
    
}
