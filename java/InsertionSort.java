import java.util.*;
class Solution{
    public int[] insertionSort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int pos=i-1;
            while(pos>=0 && arr[pos]>key){
                arr[pos+1]=arr[pos];
                pos--;
            }
            arr[pos+1]=key;
        }
        return arr;
    }


    public int[] recursiveInsertionSort(int []arr){
        int n=arr.length;
    }
}
public class InsertionSort{
    public static void main(String[] args){
        int[] arr = {12, 11, 13, 5, 6};
        Solution obj=new Solution();

        int[] ans=obj.insertionSort(arr);
        System.out.print(Arrays.toString(ans));
    }
}