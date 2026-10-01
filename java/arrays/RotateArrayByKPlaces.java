import java.util.*;
class Solution {
    public int[] rotateArray(int[] nums, int k) {
        if(k>nums.length) {
            k=Math.abs(k%nums.length);
            System.out.print(k);
        }
        
        int []arr=new int[nums.length];
        int j=0;
        for(int i=k;i<nums.length;i++){
            arr[j]=nums[i]; j++;
        }
        for(int i=0;i<k;i++){
            arr[j]=nums[i]; j++;
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        return nums;
    }
}
public class RotateArrayByKPlaces{
    public static void main(String []args){
        int[] nums = {3, 4, 1, 5, 3, -5};
        Solution sol=new Solution();
        int[] arr=sol.rotateArray(nums,8);
        System.out.print(Arrays.toString(arr));
    }
}