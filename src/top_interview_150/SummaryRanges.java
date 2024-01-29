package top_interview_150;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
	public List<String> summaryRanges(int[] nums) {
        
        List<String> answer = new ArrayList<String>();
        int i=0;
        int n= nums.length;

        while(i<n){

            int num = nums[i];
            int j = i;
            while(j+1<n && nums[j+1]==nums[j]+1){
                j++;
            }

            if(i==j){
                answer.add(String.valueOf(nums[i]));
                i++;
            } 
            else{
                answer.add(String.valueOf(nums[i])+"->"+String.valueOf(nums[j]));
                i=j+1;
            }
        }
        return answer;
    }
}
