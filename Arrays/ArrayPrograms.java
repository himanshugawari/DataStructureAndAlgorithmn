import java.util.*;

public class ArrayPrograms{
  public static void main(String[] args){
    //int[] array=new int[]{1, 2, 2, 3, 3, 3, 3, 4, 4, 5};
    Search(new int[]{1, 2, 2, 3, 3, 3, 3, 4, 4, 5},6);
    ReverseAnArray(new int[]{1, 2, 2, 3, 3, 3, 3, 4, 4, 5});
    RemoveDuplicatesFromAnSortedArray(new int[]{1, 2, 2, 3, 3, 3, 3, 4, 4, 5});
    LeftRotate(new int[]{1, 2, 2, 3, 3, 3, 3, 4, 4, 5});
    LeftRotateByN(new int[]{1, 2, 2, 3, 3, 3, 3, 4, 4, 5},3);
  }

  public static void Search(int[] arr,int x){
    boolean flag=false;   
    for(int i=0;i<arr.length;i++){
      if(arr[i]==x){
        System.out.println(x+" found at index "+i+"\n");
        flag=true;
      }
    }
    if(!flag){
      System.out.println(x+" is not found\n");
    }
  }

  public static void ReverseAnArray(int[] arr){
    System.out.println("Original Array "+Arrays.toString(arr));
    int l=0,h=arr.length-1;
    while(l<h){
      int temp=arr[l];
      arr[l]=arr[h];
      arr[h]=temp;
      l++;
      h--;
    }
    System.out.println("Reversed Array "+Arrays.toString(arr)+"\n");
  }

  public static void RemoveDuplicatesFromAnSortedArray(int[] arr){
    System.out.println("With Duplicate Array "+Arrays.toString(arr));
    int temp=1;
    for(int i=1;i<arr.length;i++){
      if(arr[temp-1]!= arr[i]){
        arr[temp]=arr[i];
        temp++;
      }
    }
    int[] t=new int[temp];
    for(int i=0;i<temp;i++){
      t[i]=arr[i];
    }
    System.out.println("Without Duplicate Array "+Arrays.toString(t)+"\n");
  }

  public static void LeftRotate(int[] arr){
    System.out.println("Original Array "+Arrays.toString(arr));
    int temp=arr[0];
    for(int i=1;i<arr.length;i++){
      arr[i-1]=arr[i];
    }
    arr[arr.length-1]=temp;
    System.out.println("Left Rotated Array "+Arrays.toString(arr)+"\n");
  }

  public static void LeftRotateByN(int[] arr,int n){
    System.out.println("Original Array "+Arrays.toString(arr));
    int[] temp=new int[n];
    for(int i=0;i<n;i++){
      temp[i]=arr[i];
    }
    for(int i=n;i<arr.length;i++){
      arr[i-n]=arr[i];
    }
    for(int i=0;i<n;i++){
      arr[arr.length-n+i]=temp[i];
    }
    System.out.println("Left Rotated by "+n+" elements in Array "+Arrays.toString(arr)+"\n");
  }

}