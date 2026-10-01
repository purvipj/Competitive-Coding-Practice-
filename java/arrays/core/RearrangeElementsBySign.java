import java.util.*;
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] pos=new int[n/2];
        int[] neg=new int[n/2];
        int j=0;
        int k=0;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                pos[j]=nums[i];
                j++;
            }
            else {neg[k]=nums[i];
                k++;
            }
        }

        int p=0;
        for(int i=0;i<n;i=i+2){
            nums[i]=pos[p];
            nums[i+1]=neg[p];
            p++;
        }
        return nums;
    }
}
public class RearrangeElementsBySign{
     public static void main(String []args){
        int[] nums1 = {-3, 4, 5, 1, -4, -5};
        
        Solution sol=new Solution();
        int[] ar=sol.rearrangeArray(nums1);
        System.out.print(Arrays.toString(ar));
        
    }
}