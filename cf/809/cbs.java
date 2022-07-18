import java.util.*;
import java.util.Scanner;

public class cbs {


    static int mincost = 0;
	public static void solution(int[][] people, int nskills, int cp, ArrayList<Integer> onesol, int skills) {
		// write your code here
		
		if( cp == people.length ){
		    if( (skills & nskills) == nskills ){
		        
                    int cur = 0;
                    for (Integer i : onesol) {
                        cur += people[i][0];
                    }
            
                    mincost = Math.max(mincost, cur);
                }
		    return ;
		}
		
		solution( people, nskills, cp+1 , onesol, skills );
		onesol.add(cp);
		solution( people, nskills, cp+1 , onesol, (skills | people[cp][1]) );
		onesol.remove( onesol.size()-1 );
		
	}

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int skills = scn.nextInt();
        int books = scn.nextInt();

        int reqSkills = 0;
        int x = scn.nextInt();
        for (int i = 0; i < x; i++) {
            reqSkills |= (1<<scn.nextInt());
        }

        int curSkills = 0;
        x = scn.nextInt();
        for (int i = 0; i < x; i++) {
            curSkills |= (1<<scn.nextInt());
        }

        int[][] book = new int[16][2];

        for (int i = 0; i < books; i++) {
            book[i][0] = scn.nextInt();            
        }
        x = scn.nextInt();
        for (int i = 0; i < x; i++) {
            book[i][1] |= (1<<scn.nextInt()); 
        }

        solution(book, reqSkills, 0, new ArrayList<>(), curSkills);
        System.out.println(mincost);

    }

}
