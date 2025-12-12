# Coin Flip Adjacency Problem

## Problem Description

Given N coins aligned in a row, where each coin shows either heads (0) or tails (1), find the maximum possible adjacency that can be obtained by reversing exactly one coin.

**Adjacency** is defined as the number of adjacent pairs of coins with the same side facing up.

### Constraints
- N is an integer within the range [1...100,000]
- Each element of array A is an integer that can have one of the following values: 0, 1

### Input/Output
- **Input**: An array A of N integers representing the coins (0 = heads, 1 = tails)
- **Output**: Maximum possible adjacency after flipping exactly one coin

## Function Signature

```java
class Solution { 
    public int solution(int[] A); 
}
```

## Examples

### Example 1
**Input:**
```
A[0] = 1
A[1] = 1
A[2] = 0
A[3] = 1
A[4] = 0
A[5] = 0
A[6] = 1
A[7] = 1
```

**Output:** `5`

**Explanation:**
- Initial adjacency = 3 (pairs: (0,1), (3,4), (5,6))
- After reversing A[2] (0→1): adjacency = 5
- New adjacent pairs: (0,1), (1,2), (2,3), (4,5), (6,7)

### Example 2
**Input:**
```
A[0] = 1
A[1] = 1
A[2] = 1
A[3] = 1
A[4] = 1
```

**Output:** `3`

**Explanation:**
- Initial adjacency = 4 (all consecutive pairs match)
- Flipping any coin decreases adjacency to 3
- Best result is 3 (obtained by flipping any coin, e.g., A[0])

## Approach

For each coin at position `i`, calculate the change in adjacency if we flip it:

1. **Count losses**: How many current adjacent pairs will be broken?
   - Check left neighbor (i-1): if A[i] == A[i-1], we lose this pair
   - Check right neighbor (i+1): if A[i] == A[i+1], we lose this pair

2. **Count gains**: How many new adjacent pairs will be created?
   - Check left neighbor (i-1): if A[i] != A[i-1], we gain this pair
   - Check right neighbor (i+1): if A[i] != A[i+1], we gain this pair

3. **Net change** = gains - losses

4. Find the position with maximum net change and add it to the initial adjacency.

## Algorithm Complexity

- **Time Complexity**: O(N) - single pass through the array
- **Space Complexity**: O(1) - only constant extra space needed
