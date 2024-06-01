package GeneralProblems;

import java.util.ArrayList;

public class q020_ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(isValid("())"));
		System.out.print(isValid("[]"));
		System.out.print(isValid("{}"));
		System.out.print(isValid("()[]{}"));
		System.out.print(isValid("(]"));
		System.out.print(isValid("{[]}"));
	}
	
	public static boolean isValid(String s) {
		/*
		 * does not work for "{[]}"
		 * 
		 * boolean conclusion = true;
		 * 
		 * for(char c : s.toCharArray()) { if(c == '(') { if(s.charAt(s.indexOf(c) + 1)
		 * != ')') return false; } else if(c == '{') { if(s.charAt(s.indexOf(c) + 1) !=
		 * '}') return false; } else if(c == '[') { if(s.charAt(s.indexOf(c) + 1) !=
		 * ']') return false; } }
		 */
		
		/*
		 * // does not work for "()[]{}"
		 * 
		 * boolean conclusion = true;
		 * 
		 * if(s.toCharArray().length % 2 != 0) return false; else { ArrayList<Character>
		 * open = new ArrayList<Character>(), close = new ArrayList<Character>(); int j
		 * = 0;
		 * 
		 * for(char c : s.toCharArray()) { if (c == '(' || c == '[' || c == '{')
		 * open.add(c); else close.add(c); }
		 * 
		 * for (int i = open.size()-1 ; i >= 0 ; --i) { if (open.get(i) == '(' &&
		 * close.get(j) != ')') return false; else if (open.get(i) == '[' &&
		 * close.get(j) != ']') return false; else if (open.get(i) == '{' &&
		 * close.get(j) != '}') return false;
		 * 
		 * ++j; } }
		 */
		boolean conclusion = true;
		return conclusion;
    }

}
