# Dynamic programming solution

- One pass hash table solution

1. We need the indices of two numbers a and b.
2. Instead of using two for loops as in the brute force solution, we can loop through the _nums_ array once and store the current element and it's index in a _POJO_ as the key and value respectively.
3. Now, as we calculate the _complement_ for each element _value_, if the element is present in the _POJO_, we can return it's value which is it's index. And if it's not present, we can just add it.
4. _POJO_ has complexity of **O(1)** for _insertion_ and _lookup_.

- Time complexity : O(n). We traverse the list containing nnn elements only once. Each look up in the table costs only O(1) time.
- Space complexity : O(n). The extra space required depends on the number of items stored in the hash table, which stores at most nnn elements.
