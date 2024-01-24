package top_interview_150;

import java.util.Arrays;

public class H_Index {

	public int getHIndex(int[] citations) {
		int h=0;
		
		Arrays.sort(citations);
		int i=citations.length-1;
		while( i>=0 && citations[i] >= h+1 ) {
			i--;
			h++;
		}
		
		return h;
	}
	
}
