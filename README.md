Given an array arr[] of size N. The task is to find the sum of the contiguous subarray within a arr[] with the largest sum. 

kadane-algorithm 
![image](https://github.com/230Souvik/LargestSumContiguousSubarray/assets/135532224/27d671ef-39a8-496b-8f83-65788c1e04bc)


The idea of Kadane’s algorithm is to maintain a variable max_ending_here that stores the maximum sum contiguous subarray ending at current index and a variable max_so_far stores the maximum sum of contiguous subarray found so far, Everytime there is a positive-sum value in max_ending_here compare it with max_so_far and update max_so_far if it is greater than max_so_far.


Pseudocode:

Initialize:
    max_so_far = INT_MIN
    max_ending_here = 0

Loop for each element of the array

  (a) max_ending_here = max_ending_here + a[i]
  (b) if(max_so_far < max_ending_here)
            max_so_far = max_ending_here
  (c) if(max_ending_here < 0)
            max_ending_here = 0
return max_so_far
