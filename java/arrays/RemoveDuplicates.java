import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int count=0;
        ArrayList<Integer> arl=new ArrayList<>();
        for(int i =0;i<n;i++){
            if(!arl.contains(nums[i])){
                arl.add(nums[i]);
                count++;
            }
        }
        System.out.print(arl);
        return count;
        
    }
    public int removeDuplicates2(int[] nums) {
        int n=nums.length;
        int count=0;
        int j=1;
        int i=0;
        while(j<n){
            if(nums[i]!=nums[j]){
                nums[i+1]=nums[j];
                i++;
                count++;
            }
            else {
                j++;
                
            }
        }

    
        System.out.print(Arrays.toString(nums));
        return count+1;
    }
    
}
public class RemoveDuplicates{
    public static void main(String []args){
        int[] nums = {3, 3, 3, 3, 6,6};
        Solution sol=new Solution();
        System.out.print(sol.removeDuplicates2(nums));
        
    }
}