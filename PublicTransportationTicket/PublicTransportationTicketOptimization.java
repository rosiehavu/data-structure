package data_structure;

public class PublicTransportationTicketOptimization {
	
	public static int findMinimumCost(int[] days) {
		
		int maxDay = days[days.length -1];
		boolean[] travelDay = new boolean[maxDay + 1];
		
		for (int day : days) {
			travelDay[day] = true;
		}
		
		int[] minCost = new int[maxDay +1];
		
		minCost[0] = 0;
		
		for (int i = 1; i <= maxDay; i++) {
			if (!travelDay[i]) {
				minCost[i] = minCost[i - 1];
				continue;
			}
			
			minCost[i] = 2 + minCost[i - 1];
			minCost[i] = Math.min(minCost[Math.max(0, i - 7)] + 7, minCost[i]);
			minCost[i] = Math.min(minCost[Math.max(0,  i - 30)] + 25, minCost[i]);
					
		}
		
		return minCost[maxDay];
	}
	
	public static void main(String[] args) {
		int[] day1 = {1, 2, 4, 5, 7, 29, 30};
		System.out.println(findMinimumCost(day1));
	}

}
