public class LogAllPairsOfArray{
  public static void main(String[] args){
    int[] boxes=new int[]{1,2,3,4,5};
    char[] boxes1=new char[]{'a','b','c','d','e'};
    logAllPairsOfArray(boxes);
    System.out.println("---------");
    logAllPairsOfArray(boxes1);
  }

  public static void logAllPairsOfArray(int[] array){
    for(int i=0;i<array.length;i++){
      for(int j=0;j<array.length;j++){
        System.out.println(array[i]+" , "+array[j]);
      }
    }
  }

  public static void logAllPairsOfArray(char[] array){
    for(int i=0;i<array.length;i++){
      for(int j=0;j<array.length;j++){
        System.out.println(array[i]+" , "+array[j]);
      }
    }
  }
}

//O(n^2)