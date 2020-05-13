import java.util.*;

public class MergeSortedArrays{
  public static void main(String[] args){
    //int[] a=new int[]{10,15,20,40};
    int[] a=new int[]{};
    int[] b=new int[]{5,6,6,10,15};
    //int[] b=new int[]{};
    merge(a,b);//Allowed Duplicates
    merge1(a,b);//Without Duplicates
  }

  //Allowed Duplicates
  public static void merge(int[] a, int[] b){
    System.out.println("Original Array a : "+Arrays.toString(a));
    System.out.println("Original Array b : "+Arrays.toString(b));
    
    int m=a.length;
    int n=b.length;

    System.out.print("Merged Sorted Array : ");

    int i=0,j=0;

    while(i<m && j<n){
      if(a[i]<b[j])
        System.out.print(a[i++] +" ");
      else
        System.out.print(b[j++] +" ");
    }
    while(i<m)
      System.out.print(a[i++] +" ");
    while(j<n)
      System.out.print(b[j++] +" ");

    System.out.println("\n");
  }

  //Without Duplicates
  public static void merge1(int[] a, int[] b){
    System.out.println("Original Array a : "+Arrays.toString(a));
    System.out.println("Original Array b : "+Arrays.toString(b));
    
    int m=a.length;
    int n=b.length;

    System.out.print("Merged Sorted Array Without Duplicates : ");

    int i=0,j=0;

    while(i<m && j<n){
      if(i>0 && a[i]==a[i-1]){
        i++;
        continue;
      }
      if(j>0 && b[j]==b[j-1]){
        j++;
        continue;
      }
      if(a[i]<b[j])
        System.out.print(a[i++] +" ");
      else if(b[j]<a[i])
        System.out.print(b[j++] +" ");
      else{
        System.out.print(a[i] +" ");
        i++;
        j++;
      }
    }
    while(i<m){
      if(i==0 || a[i]!=a[i-1]){
        System.out.print(a[i] +" ");
      }
      i++;
    } 
    while(j<n){
      if(j==0 || b[j]!=b[j-1]){
        System.out.print(b[j] +" ");
      }
      j++;
    } 
    System.out.println("\n");
  }
}