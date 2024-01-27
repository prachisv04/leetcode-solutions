package top_interview_150;

public class ValidPalindrome {
	
	public boolean isAlphaNumeric(char ch) {
		if ((ch >= '0' & ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
		      return true;
		    return false;
	}
	public boolean isPalindrome(String s) {
		 	StringBuilder result ;
	        s = s.toLowerCase();
	        for(int i=0;i<s.length();i++) {
	        	char c = s.charAt(i);
	        	if(!isAlphaNumeric(c)) {
	        		s = s.replace(c,' ');
	        	}
	        } 
	        s = s.replace(" ", "");
	        result  = new StringBuilder(s).reverse();
	        if(s.equalsIgnoreCase(result.toString()))
	        	return true;
	        return false;
        
    }
}
