
//Given an integer N, print numbers from 1 to N in lexicographic order. 

public class LexographicalOrder {
	
	public static void main(String[] args) {
		
		int N=55;
		int max=70;
		
		for(int i=1; i<max; i++){
			
			if(i<=N){
				
				if(i<10){
					
				}else if (i >= 10){
					if(i%10==0){
						System.out.println(i/10);
						System.out.println(i);
					} else {
						System.out.println(i);
					}
					
				} 
					
			}else {
				if(i%10==0)
					System.out.println(i/10);
			} 
			
			
		}
		
		
		
	}
	
	

}
