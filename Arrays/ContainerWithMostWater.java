/*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.
Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 */
import java.util.*;
class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int max=0;
        while(i<j){
            int b= j-i;
            int l= Math.min(height[i],height[j]);
            max= Math.max(max,l*b);
            if(height[i]>height[j]){
                j--;
            }
            else{
                i++;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        ContainerWithMostWater obj = new ContainerWithMostWater();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++){
            height[i] = sc.nextInt();
        }
        int result = obj.maxArea(height);
        System.out.println("The maximum area of water that can be contained is: " + result);
        sc.close();
    }
}