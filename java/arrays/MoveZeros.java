import java.util.*;
class Solution {
    public int[] moveZeroes(int[] arr) {
        int n=arr.length;
        int[] nums=new int[n];
        int count=0;
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                nums[j]=arr[i];
                j++;
            }
            else count++;
        }
        for(int i=0;i<count;i++){
            nums[j]=0;
            j++;
        }
        return nums;
    }

    public int[] moveZeroes2(int[] arr){
        int n=arr.length;
        
        int count=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) count++;
            else {
                arr[i-count] =arr[i];
            }
        }
        for(int i=n-count;i<n;i++){
            arr[i]=0;
        }
        return arr;
        
    }
    
    public int[] moveZeroes3(int[] arr){
        int n=arr.length;
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
            else {
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        return arr;
        
    }
}

public class MoveZeros{
    public static void main(String []args){
        int[] nums = {0,0, 1, 4, 0,0, 5, 2};
        Solution sol=new Solution();
        int[] arr=sol.moveZeroes3(nums);
        System.out.print(Arrays.toString(arr));
        
    }
}