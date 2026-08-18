/*
There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly left rotated at an unknown index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be left rotated by 3 indices and become [4,5,6,7,0,1,2].

Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
 

Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
All values of nums are unique.
nums is an ascending array that is possibly rotated.
-104 <= target <= 104

*/
import java.util.*;
class RotatedSortedArray {
    public int search(int[] nums, int target) {
        int left =0;
        int right= nums.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>=nums[left]){
                if(nums[left]<=target&& nums[mid]>target){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                    
                }
            }
            else{
                if(nums[right]>=target && nums[mid]<target){
                    left=mid+1;
                    
                }
                else{
                    right= mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        RotatedSortedArray obj = new RotatedSortedArray();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        System.out.println(obj.search(nums,target));
        sc.close();
    }
}