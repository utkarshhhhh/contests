import java.util.*;
public class c{

    public static int solve(String str){
        
        int i=0 , j = str.length()-1;

        while (i<=j && str.charAt(i) == '0')
                i++;
        
        while (i<=j && str.charAt(j) == '0') 
                j--;
    
        int zero = 0 , one = 0; 
        for(int k=i ; k <= j ;k++){
            if(str.charAt(j) == '0'){
                zero++;
            }else
                one++;
        }
        
        if(  zero==0 || one==0 ){
            return 0;
        }



        
        return ;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here\
		Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        while (t-->0) {
            
            String z = scn.next();
            System.out.println( solve(z) );
        }
        scn.close();
	}
    
}
