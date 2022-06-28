package GeneralProblems;

public class q58_LengthOfLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		q58_LengthOfLastWord example = new q58_LengthOfLastWord();
		
		System.out.println();
		
		//System.out.println("final answer: " + example.lengthOfLastWord("Hello World"));
		System.out.println("final answer: " + example.lengthOfLastWord(" "));
	}
	
	public int lengthOfLastWord(String s) {
        /*
		int length = 0;
        String[] words = s.split(" ");
        
        System.out.println(words.length);
        
        if(words.length != 0)
        	length = words[words.length - 1].length();
        
        return length;
        */

        String[] words = s.split(" ");
        
        System.out.println(words.length);
        
        if(words.length != 0)
        	return words[words.length - 1].length();
        
        return 0;
    }

}
