# Plane Seat Reservation Problem

## Problem Description

You are processing plane seat reservations. The plane has **N rows** of seats, numbered from 1 to N. There are **10 seats in each row** (labeled from A to K, with letter I omitted), arranged as shown below:

```
    A   B   C       D   E   F   G       H   J   K
1   [ ] [ ] [ ]     [ ] [ ] [ ] [ ]     [ ] [ ] [ ]
2   [ ] [ ] [ ]     [ ] [ ] [ ] [ ]     [ ] [ ] [ ]
3   [ ] [ ] [ ]     [ ] [ ] [ ] [ ]     [ ] [ ] [ ]
.
.
.
N   [ ] [ ] [ ]     [ ] [ ] [ ] [ ]     [ ] [ ] [ ]
```

### Seat Layout
- **ABC**: Left section (3 seats)
- **DEFG**: Middle section (4 seats)
- **HJK**: Right section (3 seats)

### Constraints

Some seats are already reserved. The list of reserved seats is given as a string `S` (of length M) containing seat numbers separated by single spaces.

**Example:** `"1A 3C 2B 40G 5A"`

The reserved seats can be listed in any order.

### Task

Your task is to **allocate seats for as many three-person families as possible**.

#### Rules:
1. A three-person family occupies **three seats that are next to each other in the same row**
2. Seats across the aisle (such as 2C and 2D) are **NOT** considered to be next to each other
3. Each available seat **cannot be taken by more than one family**

### Function Signature

```java
class Solution {
    public int solution(int N, String S);
}
```

**Parameters:**
- `N`: Number of rows (integer within range [1..50])
- `S`: String of reserved seats (length within range [0..1,909])

**Returns:**
- Maximum number of three-person families that can be seated in the remaining unreserved seats

---

## Examples

### Example 1

**Input:**
```
N = 2
S = "1A 2F 1C"
```

**Output:** `4`

**Explanation:**

Row 1: Seats 1A and 1C are occupied
- ABC: ❌ (1A and 1C occupied)
- DEF: ✅ (can seat 1 family)
- HJK: ✅ (can seat 1 family)
- **Total: 2 families**

Row 2: Seat 2F is occupied
- ABC: ✅ (can seat 1 family)
- DEF: ❌ (2F occupied)
- EFG: ❌ (2F occupied)
- HJK: ✅ (can seat 1 family)
- **Total: 2 families**

**Total families that can be seated: 4**

**Visual representation:**
```
    A   B   C       D   E   F   G       H   J   K
1   [X] [ ] [X]     [✓] [✓] [✓] [ ]     [✓] [✓] [✓]
2   [✓] [✓] [✓]     [ ] [ ] [X] [ ]     [✓] [✓] [✓]
```

### Example 2

**Input:**
```
N = 1
S = "" (empty string)
```

**Output:** `3`

**Explanation:**

Row 1: All seats are available
- ABC: ✅ (can seat 1 family)
- DEF: ✅ (can seat 1 family)
- HJK: ✅ (can seat 1 family)

**Total families that can be seated: 3**

**Visual representation:**
```
    A   B   C       D   E   F   G       H   J   K
1   [✓] [✓] [✓]     [✓] [✓] [✓] [ ]     [✓] [✓] [✓]
```

---

## Test Cases

| N | S | Expected Output | Explanation |
|---|---|-----------------|-------------|
| 2 | "1A 2F 1C" | 4 | Row 1: 2 families, Row 2: 2 families |
| 1 | "" | 3 | All sections available |
| 2 | "1A 1B 1C 1D 2A 2B 2C 2H 2J 2K" | 1 | Only 1-EFG available |
| 3 | "1A 1B 1C 1D 1E 1F 1G 1H 1J 1K" | 0 | Row 1 fully occupied, rows 2-3 have 6 families |

---

## Assumptions

- N is an integer within the range [1..50]
- M is an integer within the range [0..1,909]
- String S consists of valid seat names separated with spaces
- Every seat number appears in string S at most once

---

## License

This problem is for educational purposes.
