package top_interview_150;

public class Sqrt {

	public int mySqrt(int x) {
        return (int) Math.pow(x, 0.5);
    }
	
	public int mySqrtBinarySearch(int x) {
        if(x<=1)
        return x;

        int low = 1;
        int high = (x/2)+1;
        int sqrt=0;
        while(low<=high){
            long mid = (high+low)/2;
            
            if(mid*mid == x)
            return (int) mid;

            else
            if(mid*mid < x){
                low=(int)mid+1;
                sqrt = (int)mid;
            }
            else 
            {
                high = (int)mid-1;
            }
        }
        return sqrt;
    }
}
