
public class SecondLargestNumber {
	
	public static void main(String[] args) {
		
	
	
	  int[] arr={0,12,74,56,2,63,45};
	    int f1=1,f2=0,temp=0;
	    int num=0;

	    for(int i=0;i<arr.length;i++){
	        num=arr[i];
	        if(f1<num)
	        {
	            temp=f1;
	            f1=num;
	            num=temp;
	        }
	        if(f2<num)
	        {
	            temp=f2;
	            f2=num;
	            num=temp;
	        }
	    }
	    System.out.println("First Highest "+f1+" Second Highest "+f2+" Third "+num);

	}

}
