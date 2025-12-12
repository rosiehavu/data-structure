package data_structure;

public class CoinAdjacency {
	
	public static int findAdjacentCoinPair(int[] A) {
		
		int adjacency = 0;
		for (int i = 0; i < A.length - 1; i++) {
			if (A[i] == A[i + 1]) {
				adjacency++;
			}
		}
		
		int maxAdjacency = adjacency;
		
		for (int i = 0; i < A.length; i++) {
			int change = 0;
			
			if (i > 0) {
				if (A[i - 1] == A[i]) {
					change--;
				} else {
					change++;
				}
			}
			
			if (i < A.length - 1) {
				if (A[i] == A[i + 1]) {
					change--;
				} else {
					change++;
				}
			}
			
			maxAdjacency = Math.max(maxAdjacency, adjacency + change);
		}
		
		return maxAdjacency;
		
	}
	
	public static void main(String[] args) {
		int[] A1 = {1, 1, 0, 1, 0, 0, 1, 1};
		System.out.println(findAdjacentCoinPair(A1));
		
		int[] A2 = {1, 1, 1, 1, 1};
		System.out.println(findAdjacentCoinPair(A2));
	}

}
