package data_structure;

public class EvenPairsOnCycle {
	
	public static int findEvenPairsOnCycle(int[] arr) {
		
		if (arr == null || arr.length < 1 || arr.length > 100000) {
			System.out.println("N must be in [1..100,000]");
		}
		
		if (arr.length < 2) {
			return 0;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0 || arr[i] > 1_000_000_000) {
				System.out.println("Element must be in [0..1,000,000,000]");
			}
		}
		
		int[] trackArray = new int[arr.length];
		int pairCount = 0;
		
		
		/* 
		 * CACH 1:
		for (int i = 0; i < arr.length - 1; i++) {
			if (trackArray[i] == -1) {
				continue;
			}
			
			
			if (trackArray[i + 1] != -1 && (arr[i] + arr[i + 1]) % 2 == 0) {
				pairCount++;
				trackArray[i] = -1;
				trackArray[i + 1] = -1;
			}
		}
		
		if (trackArray[0] != -1 && trackArray[arr.length - 1] != -1 && (arr[0] + arr[arr.length - 1]) % 2 == 0) {
			pairCount++;
			trackArray[0] = -1;
		    trackArray[arr.length - 1] = -1;
		}
		*/ 
		
		for (int i = 0; i < arr.length; i++) {
			if (trackArray[i] == -1) {
				continue;
			}
			
			int nextElement = (i + 1) % arr.length;
			
			if (trackArray[nextElement] != -1 && (arr[i] + arr[nextElement]) % 2 == 0) {
				pairCount++;
				trackArray[i] = -1;
				trackArray[nextElement] = -1;
			}
		}
		
		return pairCount;
		
		}
	
	
	public static void main(String[] args) {
		int[] testArray1 = {4, 2, 5, 8, 7, 3, 7};
		System.out.println(findEvenPairsOnCycle(testArray1));
		
		int[] testArray2 = {14, 21, 16, 35, 22};
		System.out.println(findEvenPairsOnCycle(testArray2));
		
		int[] testArray3 = {5, 5, 5, 5, 5, 5};
		System.out.println(findEvenPairsOnCycle(testArray3));
	}
}
