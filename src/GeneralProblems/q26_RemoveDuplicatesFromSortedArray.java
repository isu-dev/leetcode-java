package GeneralProblems;

public class q26_RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		q26_RemoveDuplicatesFromSortedArray example = new q26_RemoveDuplicatesFromSortedArray();
		
		System.out.println();
		
//		int[] nums = {1,1,2};
//		System.out.println("Final answer " + example.removeDuplicates(nums));
		
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println("Final answer " + example.removeDuplicates(nums));
	}

	public int removeDuplicates(int[] nums) {
        int lenOriginal, i = 0, j = 0, k = 0, lenAns = 0;
        
        lenOriginal = nums.length;
        
        for(i = 0 ; i < lenOriginal-1 ; ++i) {
        	System.out.println("i" + i + "\n");
        	for(j = i+1 ; j < lenOriginal ; ++j) {
        		System.out.println("j" + j + "\n");
        		
        		System.out.println("nums[i] " + nums[i]);
        		System.out.println("nums[j] " + nums[j]);
        		
        		if(nums[i] == nums[j]) {
        			for(k = j ; k < lenOriginal-1 ; ++k) {
        				nums[k] = nums[k+1];
        			}
        			--j;
        			--lenOriginal;
        			System.out.println("New length " + lenOriginal);
        		} else
        			break;
        	}
        }
        
        return lenOriginal;
    }
}
