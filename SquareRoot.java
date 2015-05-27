
public class SquareRoot {
	
	public static void main(String[] args) {
		
		SquareRoot sr = new SquareRoot();
		sr.sqrt2(9);
		
	}

	
	public int sqrt(int n){
		int low =0;
		int high=n+1;
		
		while(high <= low){
			int mid=(low+high)/2;
			if(mid*mid < n)
				low=mid;
			else if(mid*mid > n)
				high=mid;
			else
				return mid;
		}
		
		
		return low;
	}
	
	public static double sqrt2(int n) {

	    double low = 0;
	    double high = n;
	    double mid = (high - low) / 2;

	    while (Math.abs((mid * mid) - n) > 0.000000000001) {
	        if ((mid * mid) > n) {

	            high = mid;
	            mid = (high - low) / 2;

	        } else{

	            low = mid;
	            mid = mid + ((high - low) / 2);

	        }
	    }
	    return mid;
	}
	

}
