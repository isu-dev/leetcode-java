package GeneralProblems;


/*
 * Implement strStr().

Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Clarification:

What should we return when needle is an empty string? This is a great question to ask during an interview.

For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 */


public class q028_Implement_strStr {

	public static void main(String[] args) {
		
		//String haystack = "hello", needle = "ll";
		//String haystack = "aaaaa", needle = "bba";
		String haystack = "aaa", needle = "a";
		System.out.println("Occurence in: " + strStr(haystack, needle));
		
	}

	public static int strStr(String haystack, String needle) {
        
		int index = -1;
		
		System.out.println(haystack.length() >= needle.length());
		
		if(haystack.length() >= needle.length()) {
			for(int i = 0; i <= (haystack.length() - needle.length()) ; ++i) {
				System.out.println(haystack.charAt(i) == needle.charAt(0));
				
				if( haystack.charAt(i) == needle.charAt(0) ) {
					String test = haystack.substring(i, (i+needle.length()));
					System.out.println(test);
				
					if(needle.contentEquals(test)) {
						index = i;
						break;
					}
																
				}
			}
			
		} 
		
		return index;
    }
}
