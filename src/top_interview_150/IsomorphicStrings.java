package top_interview_150;

import java.util.HashMap;

public class IsomorphicStrings {
	 public boolean isIsomorphic(String s, String t) {

	        HashMap<Character,Integer> Smap = new HashMap<Character,Integer>();
	        HashMap<Character,Integer> Tmap = new HashMap<Character,Integer>();

	        for(int i=0;i<s.length();i++){
	               if(Smap.put(s.charAt(i), i) != Tmap.put(t.charAt(i), i))
	            return false;
	        }
	        return true;
	    }
}
