import java.util.*;
class Solution {
    public List<Integer> leaders(int[] nums) {
        ArrayList<Integer> ar=new ArrayList<>();
        int n=nums.length;
        int max=nums[n-1];
        ar.add(max);
        for(int i=n-2;i>0;i--){

            if(nums[i]>max){
                
                max=nums[i];
                ar.add(max);
                
            }
        }
        Collections.reverse(ar);
        return ar;
    }
}

public class Leaders{
     public static void main(String []args){
        int[] nums1 = {-3, 4, 5, 1, -4, -5};
        
        Solution sol=new Solution();
        List<Integer> ar=sol.leaders(nums1);
        System.out.print(ar);
        
    }
}