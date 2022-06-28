package GeneralProblems;

public class q013_RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		q013_RomanToInteger example = new q013_RomanToInteger();
		
//		System.out.println(example.romanToInt("II"));
//		System.out.println(example.romanToInt("III"));
//		System.out.println(example.romanToInt("IV"));
//		System.out.println(example.romanToInt("V"));
//		System.out.println(example.romanToInt("VI"));
//		System.out.println(example.romanToInt("X"));
//		System.out.println(example.romanToInt("IX"));
//		System.out.println(example.romanToInt("XII"));
//		System.out.println(example.romanToInt("L"));
//		System.out.println(example.romanToInt("C"));
//		System.out.println(example.romanToInt("D"));
//		System.out.println(example.romanToInt("M"));
//		System.out.println(example.romanToInt("XXX"));
//		System.out.println(example.romanToInt("XL"));
//		System.out.println(example.romanToInt("XC"));
//		System.out.println(example.romanToInt("CC"));
//		System.out.println(example.romanToInt("CD"));
//		System.out.println(example.romanToInt("CM"));
//		System.out.println(example.romanToInt("DCXXI"));
		System.out.println(example.romanToInt("MDCCCLXXXIV"));
	}

	public int romanToInt(String s) {
        int i, len = s.length(), value = 0;
        char first, second;
                
        for(i = 0 ; i < len ; ++i) {
        	first = s.charAt(i);   	
        	
        	System.out.println("first: " + first);
        	
        	if ((first != 'I') && (first != 'X') && (first != 'C')) {
        		
        		System.out.println("first if");
        		
        		if(first == 'V' )
            		value += 5;
            	else if(first == 'L' )
            		value += 50;
            	else if(first == 'D')
            		value += 500;
            	else if(first == 'M')
            		value += 1000;
        		
        		System.out.println("value in first if: " + value);
        		
        	} else {
        		System.out.println("first else");
        		
        		if(i != len-1) {
        			second = s.charAt(i+1);
        			
        			System.out.println("second: " + second);
        			
            		if(second == 'V' && first == 'I')
            			value += 4;
            		else if((second == 'X') && (first == 'I'))
            			value += 9;
            		else if(second == 'L' && (first == 'X'))
            			value += 40;
            		else if((second == 'C') && (first == 'X'))
            			value += 90;
            		else if(second == 'D' && first == 'C')
            			value += 400;
            		else if(second == 'M' && first == 'C')
            			value += 900;
            		
            		System.out.println("value in second if: " + value);
            		
            		if ((second != 'I') && ( (first == 'I' && (second == 'V' || second == 'X')) ||
            				(first == 'X' && (second == 'L' || second == 'C')) || 
            				(first == 'C' && (second == 'D' || second == 'M')) ) ) {
	            			
            			++i;
	        			
	        			System.out.println("i value : " + i);
	        			
	        			continue;
            		}
        		}		
        		
    			if(first == 'I')
    				value += 1;
    			else if(first == 'X')
    				value += 10;
    			else if(first == 'C')
    				value += 100;
        		
    			System.out.println("value in first else: " + value);
    			
        		}
        	}
        
        	 
        
        return value;
    }
}
