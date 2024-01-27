package top_interview_150;

public class ZigZagConversion {
	
public String convert(String s, int numRows) {
        
        if(numRows == 1)
        return s;

        int row = 0;
        boolean down = false;

        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i] = new StringBuilder();
        
        }

        for(int i=0;i<s.length();i++){
            rows[row].append(s.charAt(i));

            if(row==0 || row == numRows-1){
                down = !down;
            }

            if(down){
                row++;
            }
            else{
                row--;
            }
        }

        StringBuilder result = new StringBuilder();
        for(StringBuilder str:rows)
        result.append(str);

        return result.toString();
    }

}
