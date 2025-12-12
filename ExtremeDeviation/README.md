# Extreme Element

## Problem Description

Given an array A consisting of N integers, find the index of an extreme element.

### Definitions

**Average Value (M):** The average value of array A is defined as:
```
M = (A[0] + A[1] + ... + A[N-1]) / N
```

**Deviation:** The deviation of element A[P] (where 0 ≤ P < N) is defined as:
```
|A[P] - M|
```
where M is the average value of array A.

**Extreme Element:** Element A[P] is called extreme if its deviation is maximal among all elements of A.

### Example

Consider the following array A consisting of four elements:
```
A[0] = 9
A[1] = 4
A[2] = -3
A[3] = -10
```

**Calculation:**
- Average value: M = (9 + 4 + (-3) + (-10)) / 4 = 0
- Deviation of A[0]: |9 - 0| = 9
- Deviation of A[1]: |4 - 0| = 4
- Deviation of A[2]: |-3 - 0| = 3
- Deviation of A[3]: |-10 - 0| = 10 ← **Maximum deviation**

Element A[3] is the extreme element with deviation 10. The function should return **3**.

### Task

Write a function:
```java
class Solution { 
    public int solution(int[] A); 
}
```

That, given an array A consisting of N integers, returns the index of an extreme element. If more than one extreme element exists, the function may return the index of any of them. If the array is empty (and hence no extreme element exists), the function should return **-1**.

### Assumptions

- N is an integer within the range [0..100,000]
- Each element of array A is an integer within the range [-2,147,483,648..2,147,483,647]

## Solution Approach

1. **Calculate Average:** Compute the average value M of all elements in the array
2. **Find Maximum Deviation:** Iterate through the array and calculate the deviation for each element
3. **Return Index:** Return the index of the element with the maximum deviation

**Time Complexity:** O(N) - Two passes through the array  
**Space Complexity:** O(1) - Only using constant extra space

## Implementation

The solution handles:
- Empty arrays (returns -1)
- Single element arrays
- Arrays with multiple extreme elements (returns any valid index)
- Large integer values using long for sum calculation to prevent overflow
