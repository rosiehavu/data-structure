package data_structure;

import java.util.Arrays;

public class MinDistinct1 {
	
	public static int findCloseNum(int current, int[] trackArray, int n) {
		int distance = 0;
		
		while (distance <= n) {
			int lower = current - distance;
			if (lower >= 1 && lower <= n && trackArray[lower] != -1) {
				return lower;
			}
			
			int upper = current + distance;
			if (upper >= 1 && upper <= n && trackArray[upper] != -1) {
				return upper;
			}
			
			distance++;
		}
		return -1;
	}
	
	public static int findMinimumIncrement(int[] arr) {
	
		int numberOfIncrement = 0;
		
		int n = arr.length;
		
		int[] trackArray = new int[n + 1];
		
		for (int i = 0; i < arr.length; i++) {
			
			int currentNum = arr[i];
			
			if (trackArray[currentNum] != -1) {
				
				trackArray[currentNum] = -1;
				
			} else {
				int newValue = findCloseNum(currentNum, trackArray, n);
				
				if (newValue == -1) {
					return -1;
				}
					
				numberOfIncrement += Math.abs(newValue - currentNum);
					
				trackArray[newValue] = -1;
					
				if (numberOfIncrement > 1000000000) {
					return -1;
				}
			}
				
		}
		return numberOfIncrement;	
	}
		
	
	
	public static void main(String[] args) {
		
		int[] testArray1 = {1, 2, 1};
		System.out.println(findMinimumIncrement(testArray1));
		
		int[] testArray2 = {6, 2, 3, 5, 6, 3};
		System.out.println(findMinimumIncrement(testArray2));
		
	}
	
}
