
public class MissingNumber {

	public static void main(String[] args) {
		MissingNumber mn = new MissingNumber();

		int[] values = {1,2,3,4,5,6,7,8,9,10,11,12,13};

		int i1 = mn.brutForce(values);
		int i2 = mn.logarithmic(values);
		
		

		
		System.out.println(i1);
		System.out.println(i2);
		


	}

	//liner
	public int brutForce(int[] numbers){

		for(int i=0; i<numbers.length-1; i++){
			if(numbers[i]	!= numbers[i+1]-1)
				return numbers[i]+1;
		}


		return 0;
	}

	public int logarithmic(int[] numbers){
		int length= numbers.length;
		int start =0;
		int end = length-1;

		while(start <= end){
			int middle = (start+end)/2;
			if(numbers[middle] != middle){
				
				if(middle == 0 || numbers[middle-1] == middle-1)
					return middle;
				
				end=middle-1;

			} else{

				start=middle+1;
			}

			
		}
		return -1;
	}

}
