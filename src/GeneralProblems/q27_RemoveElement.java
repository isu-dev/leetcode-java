package GeneralProblems;

public class q27_RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		q27_RemoveElement example = new q27_RemoveElement();
		
		System.out.println();
		
//		int nums[] = {33, 2, 2, 3}, val = 3;
//		System.out.println("Final answer " + example.removeElement(nums, val));
		
		int nums[] = {}, val = 3;
		System.out.println("Final answer " + example.removeElement(nums, val));
	}

	public int removeElement(int[] nums, int val) {
        int length = nums.length, i = 0, k = 0, remove;
        
        System.out.println("Length " + length);
        
        if(length != 0) {
            
            for(i = 0 ; i < length ; ++i) {
            	if(nums[i] == val) {
            		if(i != length-1) {
            			for(k = i ; k < length-1 ; ++k) {
            				nums[k] = nums[k+1];
            			}
            		}
                    --length;
        			--i;
        		}
            }
        }
        
        return length; 
    }
}
