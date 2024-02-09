package top_interview_150;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumberI {
	
	
	//12ms
	public int singleNumberUsingHashMap(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1)
            return entry.getKey();
        }
        return -1;
    }
	
	//3ms
	public int singleNumberusingReduce(int[] nums) {

        return Arrays.stream(nums).reduce(0, (a,b)-> a^b);    
        
	}
	
	//0ms
	public int singleNumberusingXOR(int[] nums) {

		int ans =0;
        for(int num:nums) {
        	ans = ans^num;
        }
        return ans;
	}

}
