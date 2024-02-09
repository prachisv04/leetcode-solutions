package top_interview_150;

import java.util.Arrays;

public class ClimbingStairs {
	
	//0ms
	public int climbStairsUsingIteration(int n) {
        int curr = 0;
        int prev = 1;
        int head = 0;

        for(int i=0;i<n;i++){
            head = curr+prev;
            curr = prev;
            prev = head;
        }
        return prev;
    }

	//0ms
	public int climbStairsUsingDP(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        return solve(n,dp);
    }

	private int solve(int n, int[] dp) {
		if(n<0) return 0;
		if(n==0) return 1;
		
		if(dp[n]!=-1) return dp[n];
		
		return solve(n-1,dp) + solve(n-2,dp);
	}
}
