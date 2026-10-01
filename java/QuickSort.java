import java.util.*;
class Sol{
    public void quickSort(int []arr,int start,int end){
        if(end<=start) return;
        int pivot = pivotFind(arr,start,end);

        quickSort(arr,start,pivot-1);
        quickSort(arr,pivot+1,end);
        
    }
    public int pivotFind(int []arr,int start,int end){
        int p=arr[end];
        int i=start-1;
        for(int j=start;j<=end;j++){
            if(arr[j]<p){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=arr[end];
        arr[end]=temp;

        return i;
    }

}

public class QuickSort{
    public static void main(String[] args){
        int[] arr = {12, 11, 13, 5, 6};
        Sol sol=new Sol();
        int len=arr.length;
        sol.quickSort(arr,0,len-1);
        System.out.print(Arrays.toString(arr));
    }
}