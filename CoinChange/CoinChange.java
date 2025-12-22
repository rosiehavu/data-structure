package data_structure;

import java.util.Arrays;

public class CoinChange {
	
	public static void main(String[] args) {
		int[] coins1 = {1, 3, 4};
		int money1 = 6;
		int[] memo1 = new int[money1 + 1];
		
		System.out.println(findNumCoin1(money1, coins1, memo1));
		System.out.println(findNumCoin2(money1, coins1, memo1));
		
		int[] coins2 = {1, 2, 5};
		int money2 = 11;
		int[] memo2 = new int[money2 + 1];
		
		System.out.println(findNumCoin1(money2, coins2, memo2));
		System.out.println(findNumCoin2(money2, coins2, memo2));
		
		int[] coins3 = {2};
		int money3 = 3;
		int[] memo3 = new int[money3 + 1];
		
		System.out.println(findNumCoin1(money3, coins3, memo3));
		System.out.println(findNumCoin2(money3, coins3, memo3));
		
		int[] coins4 = {1};
		int money4 = 0;
		int[] memo4 = new int[money4 + 1];
		
		System.out.println(findNumCoin1(money4, coins4, memo4));
		System.out.println(findNumCoin2(money4, coins4, memo4));
		
	}
	
	public static int findNumCoin1(int money, int[] coins, int[] memo) {
		if (money < 0) 
			return -1;
		
		if (money == 0)
			return 0;
		
		if (memo[money] != 0)
			return memo[money];
		
		int minCoin = Integer.MAX_VALUE;
		
		for (int coin : coins) {
			int result = findNumCoin1(money - coin, coins, memo);
			
			if (result >= 0) {
				minCoin = Math.min(minCoin, result + 1);
			}
		}
		
		if (minCoin == Integer.MAX_VALUE) {
			memo[money] = -1;
		} else {
			memo[money] = minCoin;
		}
		return memo[money];
		
	}
	
	public static int findNumCoin2(int money, int[] coins, int[] memo) {
		Arrays.fill(memo, money + 1);
		memo[0] = 0;
		
		for (int i = 1; i <= money; i++) {
			for (int coin : coins) {
				if (i - coin >= 0) {
					memo[i] = Math.min(memo[i], 1 + memo[i - coin]);
				}
			}
		}
		
		if (memo[money] > money) {
			return -1;
		} else {
			return memo[money];
		}
	}

}