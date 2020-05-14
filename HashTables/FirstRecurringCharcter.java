import java.util.HashSet;

//[2,5,1,2,3,5,1,2,4] ans-> 2
//[2,1,1,2,3,5,1,2,4] ans-> 1
//[2,3,4,5] ans-> -1


public class FirstRecurringCharcter{
  public static void main(String[] args){
    int[] arr1=new int[]{2,5,1,2,3,5,1,2,4};
    int[] arr2=new int[]{2,1,1,2,3,5,1,2,4};
    int[] arr3=new int[]{2,3,4,5};

    System.out.println(solution1(arr1));
    System.out.println(solution2(arr1));
  }

  public static int solution1(int[] array){
    HashSet<Integer> hs=new HashSet<>();
    for(Integer i: array){
      if(!hs.contains(i)){
        hs.add(i);
      }else{
        return i;
      }
    }
    return -1;
  }

  public static int solution2(int[] array){
    for(int i=0;i<array.length;i++){
      for(int j=i+1;j<array.length;j++){
        if(array[i]==array[j]){
          return array[i];
        }
      }
    }
    return -1;
  }
}