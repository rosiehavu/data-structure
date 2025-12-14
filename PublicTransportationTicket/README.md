# Public Transport Ticket Optimization

## Problem Description

You want to buy public transport tickets for the upcoming month. You know exactly the days on which you will be traveling. The month has 30 days and there are three types of tickets:

- **1-day ticket**: costs 2, valid for one day
- **7-day ticket**: costs 7, valid for seven consecutive days (e.g., if the first valid day is X, then the last valid day is X+6)
- **30-day ticket**: costs 25, valid for all thirty days of the month

**Goal**: Pay as little as possible.

## Input

You are given a sorted (in increasing order) array `A` of dates when you will be traveling.

### Example Input

```
A[0] = 1
A[1] = 2
A[2] = 4
A[3] = 5
A[4] = 7
A[5] = 29
A[6] = 30
```

### Example Explanation

You can buy:
- One 7-day ticket (covers days 1-7)
- Two 1-day tickets (for days 29 and 30)

**Total cost**: 11

There is no possible way of paying less.

## Function Signature

```java
class Solution { 
    public int solution(int[] A); 
}
```

## Task

Write a function that, given an array `A` consisting of `N` integers that specifies days on which you will be traveling, returns the minimum amount of money that you have to spend on tickets for the month.

## Constraints

- `N` is an integer within the range [0..30]
- Each element of array `A` is an integer within the range [1..30]
- Array `A` is sorted in increasing order
- The elements of `A` are all distinct

## Note

In your solution, focus on **correctness**. The performance of your solution will not be the focus of the assessment.

## Ticket Pricing Summary

| Ticket Type | Cost | Validity |
|-------------|------|----------|
| 1-day       | 2    | 1 day    |
| 7-day       | 7    | 7 consecutive days |
| 30-day      | 25   | All 30 days |

## Solution Approach Hints

Consider using dynamic programming to find the optimal combination of tickets that minimizes the total cost while covering all travel days.
