class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int prevCount=0;
        int currCount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                currCount++;
                if(currCount>prevCount) prevCount=currCount;
            }
            else if(nums[i]==0){
                
                currCount=0;    
            }
        }
        return prevCount;
        
    }
}
public class MaxConsecutiveOnes{
    public static void main(String []args){
        int[] nums = {1,1,1,0,1,1,0,1};
        Solution sol=new Solution();
        int ans=sol.findMaxConsecutiveOnes(nums);
        System.out.print(ans);
    }
}