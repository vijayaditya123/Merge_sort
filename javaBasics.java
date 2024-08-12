import java.util.*;
public class javaBasics{
   public static void Merge(int arr[],int si ,int mid,int en){
           int tem[] = new int[en-si+1];
           int i=si ;
           int k=0;
           int j=mid+1;
           while(i<=mid && j<=en){
             if(arr[i] < arr[j]){
               tem[k] = arr[i];
               i++;
             }
             else{
               tem[k] = arr[j];
               j++;
             }
             k++;
           }
           while(i <= mid){
              tem[k++]=arr[i++];
           }
           while(j <= en){
            tem[k++]=arr[j++];
         }
         for(i =si,k=0;k<tem.length;i++,k++){
            arr[i]=tem[k];
         }

   }
   public static void  Merge_sort(int arr[],int si ,int en){
      if(si >= en){
         return;
      }
      int mid = si+(en-si)/2;
      Merge_sort(arr,si,mid);
      Merge_sort(arr,mid+1,en);
      Merge(arr, si, mid, en);
         
   }
   
    public static void main(String args[]){
      int  arr[] = {6,3,9,5,2,8};
      Merge_sort(arr,0,arr.length-1);
      for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
      }
  }
}  

