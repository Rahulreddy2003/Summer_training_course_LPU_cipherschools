More About Time Complexity--------------------
Time complexity is defined as the amount of time taken by an algorithm to run, as a function of the length of the input. 
It measures the time taken to execute each statement of code in an algorithm. It is not going to examine the total execution time of an algorithm.

There are different types of time complexities used, let’s see one by one:
1. Constant time – O (1)

2. Linear time – O (n)

3. Logarithmic time – O (log n)

4. Quadratic time – O (n^2)

5. Cubic time – O (n^3)

and many more complex notations like Exponential time, Quasilinear time, factorial time, etc. are used based on the type of functions defined.

Constant time – O (1)
An algorithm is said to have constant time with order O (1) when it is not dependent on the input size n. Irrespective of the input size n, the runtime will always be the same.

Linear time – O(n)
An algorithm is said to have a linear time complexity when the running time increases linearly with the length of the input. 
When the function involves checking all the values in input data, with this order O(n).

Logarithmic time – O (log n)
An algorithm is said to have a logarithmic time complexity when it reduces the size of the input data in each step. 
This indicates that the number of operations is not the same as the input size.

Quadratic time – O (n^2)
An algorithm is said to have a non-linear time complexity where the running time increases non-linearly (n^2) with the length of the input. 
Generally, nested loops come under this order where one loop takes O(n) and if the function involves a loop within a loop, then it goes for O(n)*O(n) = O(n^2) order.
