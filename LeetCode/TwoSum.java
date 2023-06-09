/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists. */

//Time complexity O(n)

package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        //for optimization we need to use hash map, whenever the loop visits new element of array 
        //it will find out the complement and check if comp is there in the map or not
        //if it is not it will add current element in map
        //so when it will encounter one of the element of solution pair it will get the one inserted in map
        Map<Integer,Integer>hm = new  HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(hm.containsKey(complement))
            {
                return new int[]{i,hm.get(complement)};
            }
            hm.put(nums[i],i);
 
        }
        return null;
         
     }

    public static void main(String[] args) {
       int [] nums = new int[]{2,7,11,15};
       int []result=twoSum(nums,9);

       for (int i = 0; i < result.length; i++){
        System.out.println(result[i]);
       }
        
    }
    
}
