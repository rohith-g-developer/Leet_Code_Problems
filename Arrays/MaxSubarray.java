/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.

 

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
 

Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */
import java.util.*;
public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int max=nums[0];
        int current_Max=nums[0];
        for(int i=1;i<nums.length;i++){
             current_Max= Math.max(nums[i],current_Max+nums[i]);
             max=Math.max(current_Max,max);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MaxSubarray m = new MaxSubarray();
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int maxSubarrayValue= m.maxSubArray(nums);
        System.out.println(maxSubarrayValue);
        sc.close();
    }
}
