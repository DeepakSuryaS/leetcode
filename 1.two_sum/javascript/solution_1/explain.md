# Brute force solution

1. We need the indices of two numbers a and b.
2. The _target_ minus a gives b and vice versa. This is the _complement_ element.
3. We can loop through the _nums_ array twice to find the matching elements and return their indices.

- Time complexity : O(n^2). For each element, we try to find its complement by looping through the rest of array which takes O(n) time. Therefore, the time complexity is O(n^2).

- Space complexity : O(1).
