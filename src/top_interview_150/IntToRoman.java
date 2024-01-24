package top_interview_150;

public class IntToRoman {

	public static String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
	      int[] decimals = { 1000,900,500,400,100,90,50,40,10,9,5,4,1 };
	      String[] romans = { "M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I" };
		 	while(num>0) {
		 		int i=0;
		 		while(num<decimals[i]) {
		 			i++;
		 		}
		 		sb.append(romans[i]);
		 		num -= decimals[i];
		 		
		 	}
	  
	       return sb.toString();
	}
	
}
