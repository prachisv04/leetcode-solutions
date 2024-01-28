package top_interview_150;

import java.util.HashMap;

public class RansomeNote {
	
	public boolean canConstruct(String ransomNote, String magazine) {
		 HashMap<Character,Integer> magazineFreq = new HashMap<>();

	       
	        for(char c:magazine.toCharArray() ){
	            magazineFreq.put( c , magazineFreq.getOrDefault(c,0)+1 );
	        }

	        for(char c:ransomNote.toCharArray() ){
	            if(magazineFreq.containsKey(c) && (magazineFreq.get(c)>0)){
	               magazineFreq.put( c , magazineFreq.get(c)-1 );
	            }
	            else
	            return false;
	         
	        }
	      
	        return true;

    }
}
