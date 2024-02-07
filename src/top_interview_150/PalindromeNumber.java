package top_interview_150;
/*
 * all methods are individual , solving same problem by different approaches
 * 
 */
public class PalindromeNumber {
	
	public boolean isPalindromeByConvertingStringBuilder(int x) {
        long num = Long.valueOf(x);
        if(x<0 || !(x>=0 && x<=9))
        return false;

        StringBuilder str = new StringBuilder(String.valueOf(x));
        str.reverse();
        long numRev = Long.parseLong(str.toString());
 
        if(numRev==num)
        return true;
        return false;
    }

	public boolean isPalindromeByCharacterCompare(int x) {
        String s = String.valueOf(x); 
        int n = s.length(); 

        for (int i=0; i<n/2; i++) {
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }
        return true;
    }
	
	public boolean isPalindromeMathWay(int x) {
        if (x<0 || (x!=0 && x%10==0)) return false;
        int rev = 0;
        while (x>rev){
        	System.out.println(rev+" "+x);
            rev = rev*10 + x%10;
            x = x/10;
        }
        return (x==rev || x==rev/10);
    }
}
