package GeneralProblems;

/*
 * Determine whether an integer is a palindrome. 
 * An integer is a palindrome when it reads the same backward as forward.
 */

public class q009_PalindromeNumber {

	public static void main(String[] args) {
		
		q9_PalindromeNumber example = new q9_PalindromeNumber();
		
		System.out.println("121 : " + example.isPalindromeWithoutString(121));
		System.out.println("-121 : " + example.isPalindromeWithoutString(-121));
	}

	public boolean isPalindrome(int x) {
    
		boolean answer = false;
		String initial = String.valueOf(x), opposite;
		int end = 0, countOfDigits = initial.length(), i = 0;
		
		if(x < 0)
			answer = false;
		else {
			opposite = String.valueOf(initial.charAt(countOfDigits-1));
			
			for(i = countOfDigits-2 ; i >= end ; --i ) {
				opposite += initial.charAt(i);
			}
			
			System.out.println(opposite);
			
			if(initial.contentEquals(opposite))
				answer = true;
		}
		
		
		return answer;
		
    }
	
	
	
	public boolean isPalindromeWithoutString(int x) {
	    
		boolean answer = false;
		int y = (int) (Math.log10(x) + 1);
		double mid;
		
		System.out.println(y);
		
		if(x < 0)
			answer = false;
		else {
			mid = Math.ceil(y / 2.0);
			System.out.println(mid);
			
			if(mid % 2 == 0)
				for(int i = 0 ; i < y ; ++i)
		}
		
		return answer;
		
    }
}
