package data_structure;

public class MaxContiguousSum {
	
	public static int findMaxContiguousSum(int[] A) {
		
		int maxSum = 0;
		int currentSum = 0; 
		
		for (int i = 0; i < A.length; i++) {
			currentSum += A[i];
			
			if (currentSum > maxSum) {
				maxSum = currentSum;
			}
			
			if (currentSum < 0) {
				currentSum = 0;
			}
		}
		
		
		return maxSum;
		
	}

	public static void main(String[] args) {
		int[] A1 = {7,-2,-7,4,3,2};
		System.out.println(findMaxContiguousSum(A1));
		
		int[] A2 = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(findMaxContiguousSum(A2));
		
		int[] A3 = {5,4,-1,7,8};
		System.out.println(findMaxContiguousSum(A3));
	}
}
