package GeneralProblems;

/*
 * Given a non-empty array of decimal digits representing a non-negative integer, 
 * increment one to the integer.
 * 
 * The digits are stored such that the most significant digit is at the head of the list, 
 * and each element in the array contains a single digit.
 * 
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 */

public class q66_PlusOne {

	public static void main(String[] args) {

		q66_PlusOne test = new q66_PlusOne();
		
		int[] digits = {2, 9, 9} , finalans = test.plusOne(digits);
		
		for(int i = 0 ; i < finalans.length ; ++i)
			System.out.println(finalans[i]);
	}

	public int[] plusOne(int[] digits) {
        
		if(digits[digits.length - 1] != 9)
			digits[digits.length - 1] += 1;
		else {
			
			digits[digits.length - 1] = 0;
			
			try {
				int previous = digits[digits.length - 2];
				int index = digits.length - 2;
				boolean increased = false;
				
				do {
					
					if(previous != 9) {
						digits[index] += 1;
						increased = true;
					} else {
						digits[index] = 0;
						previous = digits[--index];
					}
					
				} while(!increased);
				
			} catch (ArrayIndexOutOfBoundsException e) {
				
				int[] newdigits = new int[digits.length+1];
				//System.out.println(newdigits.length);
				
				for(int i = digits.length-1 ; i >= 0 ; --i) {
					newdigits[i+1] = digits[i];
				}
				
				newdigits[0] = 1;
				
				return newdigits;
			}	
		}
		
		return digits;
    }
}
