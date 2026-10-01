import java.util.*;

class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        int n=Math.min(nums1.length,nums2.length);
        
        ArrayList<Integer> arl=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length ){
            if(nums1[i]==nums2[j]){
                arl.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]) j++;
            
            
        }
        int[] arr=new int[arl.size()];
        for(int k=0;k<arr.length;k++){
            arr[k]=arl.get(k);
        }
        return arr;
    }
}
public class IntersectionArray{
     public static void main(String []args){
        int[] nums1 = {-45, -45, 0, 0, 2};
        int[] nums2 = {-50, -45, 0, 0, 5, 7};
        Solution sol=new Solution();
        int[] arr=sol.intersectionArray(nums1,nums2);
        System.out.print(Arrays.toString(arr));
        
    }
}