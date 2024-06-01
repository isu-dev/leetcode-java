package GeneralProblems;

import java.util.ArrayList;

public class q3110_ScoreOfAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(scoreOfString("hello"));
		System.out.println(scoreOfString("zaz"));
	}

	public static int scoreOfString(String s) {
        int val = 0;
        char[] ch = s.toCharArray();
        
        for(int i = 0 ; i < ch.length - 1 ; ++i) {
        	val += Math.abs((int) ch[i] - (int) ch[i+1]);
        }
        
        return val;
    }
}
