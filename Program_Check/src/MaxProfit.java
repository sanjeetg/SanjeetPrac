
public class MaxProfit {

	public static void main(String[] args) {

		int arr [] = {70, 80, 60, 30, 50, 100, 40,85};
		System.out.println(maxProfit(arr));
	}

	
	private static int maxProfit(int arr[]) {
		int price = arr[0];
		int profit = 0;
		
		for(int i=1;i<arr.length;i++) {
			if(price > arr[i]) {
				price = arr[i];
			}
			else if(profit < arr[i]-price) 
				profit  = arr[i]- price;
			}
		return profit;
		}
	}

