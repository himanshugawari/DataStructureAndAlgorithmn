public class AllPairSums{
  public static void main(String[] args){
    printAllNumbersThenAllPairSums(new int[]{1,2,3,4,5});
  }

  public static void printAllNumbersThenAllPairSums(int[] array){
    System.out.println("These are the numbers");
    for(Integer i: array){
      System.out.println(i);
    }

    System.out.println("And these are the sum of the numbers");
    for(Integer i: array){
      for(Integer j: array){
        System.out.println(i+j);
      }
    }
  }
}

//O(n + n^2)  --> O(n^2)


//O(x^2 + 3x + 100 + x/2)  --> O(x^2)
