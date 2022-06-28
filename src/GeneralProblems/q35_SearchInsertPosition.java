package GeneralProblems;

public class q35_SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		q35_SearchInsertPosition example = new q35_SearchInsertPosition();
		
		System.out.println();
		
		int nums[] = {1,3,5,6}, target=5;
		System.out.println("Final Answer: " + example.searchInsert(nums, target));
	}

	public int searchInsert(int[] nums, int target) {
        int position = -1, len = nums.length, i = 0;
        
        if(len != 0) {
        	for(i = 0 ; i < len ; ++i) {
        		if(nums[i] == target) {
        			position = i;
        			break;
        		} else if(nums[i] > target) {
        			position = i;
        			break;
        		}
        	}
        }
        
        if(position == -1)
        	position = len;
        
        return position;
    }
}
