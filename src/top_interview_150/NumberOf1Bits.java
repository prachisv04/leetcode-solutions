package top_interview_150;

public class NumberOf1Bits {
	 public int hammingWeight(int n) {
		 return 
	       
	        Integer.bitCount(n);

	    }
	 
	 public int hammingWeightString(int n) {
	        return Integer.toBinaryString(n).replace("0", "").length();
	    }

}
