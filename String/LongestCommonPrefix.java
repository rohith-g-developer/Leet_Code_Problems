/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 
*/
package String;
import java.util.*;
class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        String check=strs[0];
        int j = strs[0].length();
        for(int i=1;i<strs.length;i++){
            if(j==0){
                break;
            }
            while(strs[i].indexOf(check)!=0){
                check=check.substring(0,j-1);
                j--;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        LongestCommonPrefix obj = new LongestCommonPrefix();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of strings:");
        int n = sc.nextInt();
        String[] strs = new String[n];
        System.out.println("Enter the strings:");
        for(int i=0;i<n;i++){
            strs[i] = sc.next();
        }
        String result = obj.longestCommonPrefix(strs);
        System.out.println("The longest common prefix is: " + result);
        sc.close();
    }
}
