// Given a collection of numbers and sum. Find a matching pair equal to the sum.
// e.g  [1,2,3,9]  sum=8 --> Answer False
// e.g  [1,2,4,4]  sum=8 --> Answer True

import java.util.HashSet;

public class GoogleInterview{
  public static void main(String[] args){
    int[] a =new int[]{1,2,3,9};
    int[] b =new int[]{1,2,4,4};
    int sum=8;

    System.out.println(solution1(a,sum)); // O(n^2)
    System.out.println(solution1(b,sum)); // O(n^2)

    System.out.println(solution2(a,sum)); // O(n)
    System.out.println(solution2(b,sum)); // O(n)

    System.out.println(solution3(a,sum));// O(n) SpaceComplexity->O(n)
    System.out.println(solution3(b,sum));// O(n) SpaceComplexity->O(n)
  }

  public static boolean solution1(int[] array,int sum){
    for(int i=0;i<array.length;i++){
      for(int j=i;j<array.length;j++){
        if((array[i]+array[j])==sum){
          return true;
        }
      }
    }
    return false;
  }

  public static boolean solution2(int[] array,int sum){
    int low=0;
    int high=array.length-1;
    while(low<high){
      int s=array[low]+array[high];
      if(s==sum){
        return true;
      }else if(s<sum){
        low++;
      }else if(s>sum){
        high--;
      }
    }
    return false;
  }

  public static boolean solution3(int[] array,int sum){
    HashSet<Integer> complement=new HashSet<>();
    for(Integer i:array){
      if(complement.contains(i)){
        return true;
      }
      complement.add(sum-i);
    }
    //System.out.println(complement.toString());
    return false;
  }
}