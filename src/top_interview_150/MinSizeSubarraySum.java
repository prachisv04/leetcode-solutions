package top_interview_150;

public class MinSizeSubarraySum {

	public int minSubArrayLen(int target, int[] arr) {
        int res = Integer.MAX_VALUE;
		int i=0, j=1;
		int currSum = arr[i];
		while(j<arr.length) {
			while(j<arr.length && currSum<target) {
				currSum+=arr[j];
				j++;
			}
			if(currSum>=target) {
				res = Math.min(res, j-i+1);
			}
			while(i<j && currSum>=target) {
				res = Math.min(res, j-i);
				currSum-=arr[i];
				i++;
			}
		}
        
		if(arr.length==1) {
			if(arr[0]>=target) 
				return 1;
			else
			return 0;
		}else   
        if(res==Integer.MAX_VALUE)
            return 0;
            else         
		return res;
    }
	
}
