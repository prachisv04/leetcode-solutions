package top_interview_150;

import java.util.HashMap;

public class ContainDuplicate {
	
public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        HashMap<Integer,Integer> numMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            if(numMap.containsKey(nums[i])){
                int idx = numMap.get(nums[i]);
                if( (i-idx) <= k )
                    return true;       
            }
            numMap.put(nums[i],i);
        }
        return false;
    }

}
