import java.util.*;
class Solution {
    public int largest(int[] nums){
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                max=nums[i];
            }
            
        }
        return max;
    }
    public int secondLargestElement(int[] nums) {
        int large=largest(nums);
        int secondLarge=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>secondLarge && nums[i]<large){
                secondLarge=nums[i];
            }
           
        }
        if(secondLarge==Integer.MIN_VALUE) return -1;
        else return secondLarge;
    }
    public int secondLargestElement2(int[] nums){
        int large=nums[0];
        int secondLarge=Integer.MIN_VALUE;  
        for(int i=1;i<nums.length;i++){
            if(nums[i]>large){
                secondLarge=large;
                large=nums[i];
   
            } 
            if(nums[i]>secondLarge && nums[i]!=large) secondLarge=nums[i];
        }
        if(secondLarge==Integer.MIN_VALUE) return -1;
        else return secondLarge;
    }
}
public class SecondLargest{
    public static void main(String []args){
        int[] nums = {7,7,2,2,10,10,10};
        Solution sol=new Solution();
        int largestno=sol.secondLargestElement2(nums);
        System.out.print(largestno);
    }
}