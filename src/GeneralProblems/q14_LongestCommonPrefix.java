package GeneralProblems;

public class q14_LongestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		q14_LongestCommonPrefix example = new q14_LongestCommonPrefix();
		
//		String[] strs = {"flower","flow","flight"};
		
//		String[] strs = {"dog", "racecar", "race"};
		
		String[] strs = {"abab", "aba", ""};
		System.out.println(example.longestCommonPrefix(strs));

	}
	
	public String longestCommonPrefix(String[] strs) {
		String common = "";
		int len = strs.length, i, j;
		char ch;
		boolean unmatched = false;
		
		System.out.println("elements: " + len);
		
		if(len == 0)
			common = "";
		else if(len == 1)
			common = strs[0];
		else {
			for(i = 0 ; i < strs[0].length() ; ++i) {
				
				ch = strs[0].charAt(i);
				
				System.out.println("current char: " + ch);
				
				for(j = 1 ; j < len ; ++j) {
					if(i >= strs[j].length())
						break;
					else if(ch != strs[j].charAt(i)) {
						System.out.println("unmatched");
						unmatched = true;
						break;
					}
					else if(ch == strs[j].charAt(i) && j == len-1) {
						common += ch;
						System.out.println("current match: " + common);
					}
				}
				
				if(unmatched)
					break;
			}
		}
		
        return common;
    }

}
