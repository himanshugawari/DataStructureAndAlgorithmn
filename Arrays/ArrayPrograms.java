import java.util.*;

public class ArrayPrograms{
  public static void main(String[] args){
    int[] array=new int[]{1, 2, 2, 3, 3, 3, 3, 4, 4, 5};
    Search(array,6);
    ReverseAnArray(array);
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
    System.out.println("Reversed Array "+Arrays.toString(arr));
  }

}