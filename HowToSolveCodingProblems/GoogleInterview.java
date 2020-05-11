// Given a collection of numbers and sum. Find a matching pair equal to the sum.
// e.g  [1,2,3,9]  sum=8 --> Answer False
// e.g  [1,2,4,4]  sum=8 --> Answer True

public class GoogleInterview{
  public static void main(String[] args){
    int[] a =new int[]{1,2,3,9};
    int[] b =new int[]{1,2,4,4};
    int sum=8;

    System.out.println(solution1(a,sum)); // O(n^2)
    System.out.println(solution1(b,sum)); // O(n^2)

    System.out.println(solution2(a,sum)); // O(n^2)
    System.out.println(solution2(b,sum)); // O(n^2)

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
    for(int i=0;i<array.length;i++){
      for(int j=i;j<array.length;j++){
        if((array[i]+array[j])==sum){
          return true;
        }
      }
    }
    return false;
  }
}