package top_interview_150;

import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSumII {
	//2ms
	public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];

        int start =0;
        int end = numbers.length -1;

        while(start<end){
            if(numbers[start] + numbers[end] == target){
                ans[0] = start+1;
                ans[1] = end+1;
                break;
            }
            else 
            if(target < numbers[start] + numbers[end])
            end--;
            else
            start++;
        }
        return ans;
    }
	
	//7ms
	public int[] twoSumUsingHashMap(int[] numbers, int target) {

        Map<Integer, Integer> map = new LinkedHashMap<>();
        int[] arr = new int[2];
        int n = numbers.length;

        for (int i=0; i<n; i++) {
         map.put(numbers[i], i);
        }

        int secondIdx=0;

        for (int i=0; i<n; i++) {
         if (map.containsKey(target - numbers[i])) {
             secondIdx = map.get(target - numbers[i]);
             arr[0] = i+1;
             arr[1] = secondIdx+1;
             break;
         }
         
        }

        return arr;
        
    }

}
