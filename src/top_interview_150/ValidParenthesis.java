package top_interview_150;

import java.util.Stack;

public class ValidParenthesis {
	
	public boolean isValid(String s) {

        Stack<Character> parenthesis = new Stack<>();

        for(char c:s.toCharArray()){

            if(c=='(' || c=='{' || c=='['){
                parenthesis.push(c);
            }
            else 
            {
                if(parenthesis.size()>0){
                    char top = parenthesis.peek();
                    if( (c==')' && top=='(') || (c=='}' && top=='{') || (c==']' && top=='[') )
                    parenthesis.pop();
                    else
                    return false;
                }
                else
                return false;
            }
        }
        if(parenthesis.size()>0)
            return false;
        else
        return true;
    }

}
