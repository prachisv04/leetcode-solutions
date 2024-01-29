package top_interview_150;

public class HappyNumber {
	
	 int square_sum(int num){
	        int sum =0;

	        while(num>0){
	            sum += (num%10)*(num%10);
	            num/=10;
	        }
	        return sum;
	    }

	    public boolean isHappy(int n) {
	        
	        int sum = n;

	        while(sum!=1){
	            sum = square_sum(sum);
	            if(sum==1) return true;
	            if(sum==4) return false;
	        }
	        return true;
	    }

}
