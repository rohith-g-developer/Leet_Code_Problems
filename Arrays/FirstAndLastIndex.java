/*Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
*/
import java.util.*;
class FirstAndLastIndex {
    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;
        int first=-1;
        int last= -1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                first=mid;
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        if(first==-1) return new int[] {-1,-1}; 
        left=0;
        right=nums.length-1; 
        while(left<=right){
            int mid = left + (right-left)/2;
            if(nums[mid]==target){
                last=mid;
                left=mid+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else
            {
                right=mid-1;
            }
        }
        return new int[] {first,last};
    }
    public static void main(String[] args) {
        FirstAndLastIndex obj = new FirstAndLastIndex();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");  
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();
        int[] result = obj.searchRange(nums, target);
        System.out.println(Arrays.toString(result)); 
        scanner.close();
    }
}