package top_interview_150;


public class ArrayMultiplicationWithoutSelf {
	
	 public int[] productExceptSelf(int[] nums) {
		 int numsLength = nums.length;
		   int prefix = 1;
	        int suffix = 1;
	        int[] result = new int[numsLength];
	        
	        for(int i = 0; i < numsLength; i++) {
	            result[i] = prefix;
	            prefix *= nums[i];
	            
	        }
	        
	        for(int i = numsLength-1; i >= 0; i--) {
	        	
	            result[i] *= suffix;
	            suffix *= nums[i];
	        }
	        return result;
  	        
	    }

	public static void main(String[] args) {
		
		int[] nums = {1,2,3,4};
		ArrayMultiplicationWithoutSelf obj = new ArrayMultiplicationWithoutSelf();
		obj.productExceptSelf(nums);
		
	}

}
