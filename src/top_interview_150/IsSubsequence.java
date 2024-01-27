package top_interview_150;

public class IsSubsequence {

	public static void main(String[] args) {
		
		System.out.println(new IsSubsequence().isSubsequence("abc", "ahbgdc"));
	}
	
	public boolean isSubsequence(String s, String t) {
    
		char[] sequence = s.toCharArray();
		char[] input = t.toCharArray();
		
		int i=0;
		int j=0;
		
		while(i<sequence.length && j<input.length) {
			if(sequence[i]==input[j]) {
				i++;
				j++;
			}
			else {
				j++;
			}
		}
		if(i==sequence.length)
			return true;
		return false;
	} 

}
