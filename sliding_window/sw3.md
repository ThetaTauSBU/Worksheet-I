Given an array nums, there is a sliding window of size k which is moving from the very left of the array to the very right. 
You can only see the k numbers in the window. 
Each time the sliding window moves right by one position. 
Return the max sliding window.

Example:

Input: nums = [1,3,-1,-3,5,3,6,7], and k = 3 <br>
Output: [3,3,5,5,6,7] 

Explanation: 

Window position                Max<br>
---------------               -----<br>
[1  3  -1] -3  5  3  6  7       3<br>
 1 [3  -1  -3] 5  3  6  7       3<br>
 1  3 [-1  -3  5] 3  6  7       5<br>
 1  3  -1 [-3  5  3] 6  7       5<br>
 1  3  -1  -3 [5  3  6] 7       6<br>
 1  3  -1  -3  5 [3  6  7]      7<br>
 
Note: <br>
You may assume k is always valid, 1 ≤ k ≤ input array's size for non-empty array.