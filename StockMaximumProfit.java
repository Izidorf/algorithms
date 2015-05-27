//Given historical data for the stocks of a company for say 8 day.
//you can buy and sell the stocks just once. Find the maximum profit you can make: 
//Day	1	2	3	4	5	6	7	8 
//		5	9	6	2	4	8	3	1

public class StockMaximumProfit {
	public static void main(String[] args) {
		int[] prices = {5,	9,	6,	2,	4,	8,	3,	1};
		StockMaximumProfit smp = new StockMaximumProfit();
		int diff = smp.getPrices(prices);
		
		System.out.println(diff);
		System.out.println(String.format("%.2g%n", smp.square(125)));
	}

	
	//Linear time solution
	public int getPrices(int[] stocks){

		int min = 0;
		int maxDiff = 0;
		int  buy = 0, sell = 0;
		int sz = stocks.length;
		  for (int i = 0; i < sz; i++) {
		    if (stocks[i] < stocks[min])
		      min = i;
		    int diff = stocks[i] - stocks[min];
		    if (diff > maxDiff) {
		      buy = min;
		      sell = i;
		      maxDiff = diff;
		    }
		    
		    
		  }

		  return (stocks[sell]-stocks[buy]);

	}
	
	public float square(int n){
		float estimation=1;
		int cycles=50;
		
		while(cycles>0){
			estimation=(estimation+(n/estimation))/2;
			--cycles;
		}
		
		
		return estimation;
		
	}


}



