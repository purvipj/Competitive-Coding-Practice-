class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int x=0;
        for(int i=0;i<n;i++){
           if(count==0) x=nums[i];
            if(nums[i]==x){
                count++;
                
            }
            else{
                count--;
                // if(count<0) count=0;
                
            }
             
            
        }
        return x;
    }
}
public class MajorityElement1{
     public static void main(String []args){
        // int[] nums1={60,58,42,42,42,59,42,42,42,42,69,42,42,11,30,85,42,42,42,17,42,42,42,42,80,42,42,53,3,42,96,69,83,42,83,39,34,64,90,30,42,42,69,62,42,23,42,42,42,36,99,71,56,17,42,15,42,42,32,42,42,79,42,75,42,42,42,87,42,76,76,42,36,42};
        // int[] nums1 = {60,58,42,42,42,59,42,42,42,42,69,42,42,11};
            // 30,85,42,42,42};
        // int[] nums1={1, 1, 1, 2, 1, 2};
        // int[] nums1={7, 0, 0, 1, 7, 7, 2, 7, 7};
        Solution sol=new Solution();
        int ans=sol.majorityElement(nums1);
        System.out.print(ans);
        
    }
}