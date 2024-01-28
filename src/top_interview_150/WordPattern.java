package top_interview_150;

import java.util.HashMap;

public class WordPattern {
	
	public boolean wordPattern(String pattern, String s) {
	        
		  HashMap<Character,String> hashTable = new HashMap<>();
	      String[] subs = s.trim().split(" ");
	      int i=0;
	
	      if(subs.length != pattern.length())
	      	return false;
	      
	      for(Character c : pattern.toCharArray()){        
	      	
	      	if( (hashTable.containsKey(c) || hashTable.containsValue(subs[i]) ) && !hashTable.getOrDefault(c,"null").equals(subs[i])) {
	      	return false;
	      	}
	      	else {
	      		hashTable.put(c, subs[i]);
	      		}
	      		
	      	i++;
	      }
	      return true;
	 }

}
