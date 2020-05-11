import java.util.*;

public class SpaceComplexity{
  public static void main(String[] args){
    int[] t=new int[]{1,2,3,4,5};
    booooo(t); // O(1)
    System.out.println(Arrays.toString(arrayOfHiNTimes(t)));// O(n)
  }
  public static void booooo(int[] n){
    for(Integer i: n){
      System.out.println("boooo! "+i);
    }
  }
  public static String[] arrayOfHiNTimes(int[] n){
    String[] temp=new String[n.length];
    for(int i=0;i<n.length;i++){
      temp[i]="hi";
    }
    return temp;
  }
}