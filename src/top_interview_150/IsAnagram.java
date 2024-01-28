package top_interview_150;

import java.util.Arrays;

public class IsAnagram {
	
	public static void main(String args[]) {
		new IsAnagram().isAnagram("anagram", "nagaram");
	}
	
	public boolean isAnagram(String s, String t) {
		  if(s.length()!=t.length())
	        	return false;
      char[] Sarray = s.toCharArray();
      char[] Tarray = t.toCharArray();
     
      Arrays.sort(Sarray);
      Arrays.sort(Tarray);
       return Arrays.equals(Sarray, Tarray);
    }

}
