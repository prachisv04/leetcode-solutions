package top_interview_150;


public class ReverseWords {
	 public String reverseWords(String s) { 
	        StringBuilder str = new StringBuilder();
	        String[] subs = s.split(" ");
	        for(int i=subs.length- 1;i>=0;i--){
	        	if(!subs[i].isBlank())
	            str.append(subs[i]+" ");
	        }
	        return str.toString().trim();
	    }
	 
	 public static void main(String[] args) {
		 
		 System.out.println(new ReverseWords().reverseWords("   Hello     World   "));
		 
	 }
}
