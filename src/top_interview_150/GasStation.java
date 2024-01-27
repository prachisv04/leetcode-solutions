package top_interview_150;

public class GasStation {
	 public int canCompleteCircuit(int[] gas, int[] cost) {
	        
	        int n = gas.length;

	        int total =0;
	        int deficit = 0;
	        int start = 0;

	        for(int i=0;i<n;i++){
	            total += gas[i]-cost[i];
	            deficit += gas[i]-cost[i];

	            if(deficit<0){
	                deficit =0;
	                start=i+1;
	            }
	        }

	        if(total<0)
	        return -1;
	        return start;

	    }
}
