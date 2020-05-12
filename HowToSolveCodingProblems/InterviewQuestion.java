//Given 2 arrays, create a function that lets a user know (true or false) whether two arrays contain any common items.
// e.g. arr1=['a','b','c','x'] arr2=['z','y','i'] Answer=False
// e.g. brr1=['a','b','c','x'] brr2=['z','y','x'] Answer=True

// 2 parameters - arrays - no size limits
// return true or false

import java.util.HashMap;
import java.util.HashSet;

public class InterviewQuestion{
  public static void main(String[] args){
    char[] arr1=new char[]{'a','b','c','x'};
    char[] arr2=new char[]{'z','y','i'};

    char[] brr1=new char[]{'a','b','c','x'};
    char[] brr2=new char[]{'z','y','x'};

    System.out.println(solution1(arr1,arr2)); // O(n^2) or O(a*b)
    System.out.println(solution1(brr1,brr2)); // O(n^2) or O(a*b)

    System.out.println("---------");

    System.out.println(solution3(arr1,arr2)); // O(n+n) or O(a+b)  Space Complexity --> O(array1)
    System.out.println(solution3(brr1,brr2)); // O(n+n) or O(a+b)  Space Complexity --> O(array1)
  }

  public static boolean solution1(char[] array1,char[] array2){
    for(int i=0;i<array1.length;i++){
      for(int j=0;j<array2.length;j++){
        if(array1[i]==array2[j]){
          //System.out.println("Common Item is : "+array1[i]);
          return true;
        }
      }
    }
    return false;
  }

public static boolean solution2(char[] array1,char[] array2){
  HashMap<Character,Boolean> map=new HashMap<>();
  for(int i=0;i<array1.length;i++){
    if(!map.containsKey(array1[i])){
      map.put((Character)array1[i],true);
    }
  }
  //System.out.println(map.toString());
  for(int i=0;i<array2.length;i++){
    if(map.containsKey(array2[i])){
      return true;
    }
  }
  return false;
}

// Same as Solution2 only using HashSet instead of HashMap
public static boolean solution3(char[] array1,char[] array2){
  HashSet<Character> set=new HashSet<>();
  for(int i=0;i<array1.length;i++){
    if(!set.contains(array1[i])){
      set.add((Character)array1[i]);
    }
  for(int i=0;i<array2.length;i++){
    if(set.contains(array2[i])){
      return true;
    }
  }
  return false;
}

}