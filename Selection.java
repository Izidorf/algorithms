/*
 * Given an array with N integer numbers your task is to print
 * to the standard output (stdout) the smallest K numbers among them.
 * 
 * */

public class Selection {
	
	public static void main(String[] args) {
		
		int[] ar = new int[]{1234, 314, 3124, 2134, 34,  3, 2, 231, 34, 35, 321};
		
		Selection s = new Selection();
//		int[] result = s.select(ar, 2);
//		
//		for(int i : result)
//			System.out.println(i+" ");
		
		
		
		
	}
	
	//an array of size n to keep the smallest elements
	
	
	
	//position of the  biggest
	// biggest
	
	//int current
	
	public int[] select(int[] numbers, int n){
		int[] smallest = new int[n];
		for(int s=0; s<n; s++)
			s=Integer.MAX_VALUE;
		int current;
		int temp;
		
		int bigest;
		
		for(int i=0; i<=numbers.length-1; i++){
			current=numbers[i];
						
			for(int j=1; j<smallest.length-1; j++){
				if(smallest[j-1] > smallest[j]){
					temp=smallest[i-1];
					smallest[j-1]=smallest[j];
					smallest[j]=temp;	
				}
				
			}
			
			bigest=smallest[n-1];
			
			if(current<bigest)
				smallest[n-1]=current;			
		}
		
		
		
		return smallest;
	}
	
	

}
