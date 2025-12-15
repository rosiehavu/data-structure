# Longest Zigzag Path in Binary Tree

## Problem Description

Given a binary tree, find the length of the longest **zigzag** path starting at the root and forming a downwards path.

### What is a Zigzag?

A **turn** on a path is defined as a change in the direction of the path (i.e., a switch from right to left or vice versa). A **zigzag** is simply a sequence of turns (it can start with either right or left). The **length** of a zigzag is equal to the number of turns.

### Example

Consider the binary tree below:

```
        5
       / \
      3   10
     /   / \
    20  1   15
   /       / \
  6      30   8
          \
           9
```

In this tree, the marked path has two turns:
- First turn at node [15]
- Second turn at node [30]

This means the length of this zigzag is equal to 2. This is the longest zigzag in the tree under consideration.

**Note:** A zigzag containing only one edge or one node has length 0.

## Task

Write a function:

```java
class Solution { 
    public int solution(Tree T); 
}
```

that, given a non-empty binary tree `T` consisting of `N` nodes, returns the length of the longest zigzag starting at the root.

For example, given tree `T` shown in the figure above, the function should return `2`, as explained above. Note that the values contained in the nodes are not relevant in this task.

## Technical Details

### Tree Structure

A binary tree can be specified using a pointer data structure with the following declarations:

```java
class Tree {
    public int x;
    public Tree l;
    public Tree r;
}
```

- An empty tree is represented by an empty pointer (denoted by `null`)
- A non-empty tree is represented by a pointer to an object representing its root
- The attribute `x` holds the integer contained in the root
- Attributes `l` and `r` hold the left and right subtrees of the binary tree, respectively

### Tree Notation

For test cases, you can denote a tree recursively in the following way:
- An empty binary tree is denoted by `None`
- A non-empty tree is denoted as `(X, L, R)`, where `X` is the value contained in the root and `L` and `R` denote the left and right subtrees, respectively

The tree from the above figure can be denoted as:

```
(5, (3, (20, (6, None, None), None), None), (10, (1, None, None), (15, (30, None, (9, None, None)), (8, None, None))))
```

## Assumptions

Write an **efficient** algorithm for the following assumptions:

- `N` is an integer within the range [1..100,000]
- The height of tree `T` (number of edges on the longest path from root to leaf) is within the range [0..800]

## Constraints

- Time complexity should be efficient for large trees
- Space complexity should consider the recursive call stack or iterative approach

## Examples

### Example 1
**Input:** Tree shown in problem description  
**Output:** `2`  
**Explanation:** The longest zigzag path is root → right → left → right (5 → 10 → 15 → 30)

### Example 2
**Input:** Single node tree  
**Output:** `0`  
**Explanation:** No turns possible

### Example 3
**Input:** Tree with only left children  
**Output:** `0`  
**Explanation:** No direction changes, so no zigzag
