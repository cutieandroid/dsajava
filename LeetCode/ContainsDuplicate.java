package LeetCode;
/*
 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.

 

Example 1:

Input: nums = [1,2,3,1]
Output: true
Example 2:

Input: nums = [1,2,3,4]
Output: false
Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
 

Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109
 */

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    private static boolean containsDuplicate(int[] nums) {
        //create map to keep track of the visited elements
        Map<Integer,Integer>hm= new HashMap<Integer,Integer>();
        for (int i=0;i<nums.length;i++)
        { 
            //for each element check if there is any same value in the map
            if(hm.containsKey(nums[i]))
            {
                return true;
            }
            //if no same value till now then add this element in the map
            else
            {
                 hm.put(nums[i],i);
            }
           
        }
        //if after iterating all the elements in the array function is not returned true
        //this means there is no duplicate so return false
        return false;
        
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,1};
        System.out.println(containsDuplicate(nums));
        
    }
    
}
