import java.util.*;

public class ArrayListExample{
  public static void main(String[] args){
    //List<E> arrayList=new ArrayList<>()
    ;
    //Constructs an empty list with an initial capacity of 10.

    //Constructs an empty list with an initial capacity of 5;
    List<Integer> arrayList=new ArrayList<>(5);

    for(int i=0;i<=5;i++){
      arrayList.add(i);// appends at end 
    }
    System.out.println(arrayList+"\n");

    arrayList.add(0,9);// inserts 9 at index 0
    System.out.println(arrayList+"\n");

    arrayList.remove(3);// removes at index 3
    System.out.println(arrayList+"\n");

    //size()
    for(int i=0;i<arrayList.size();i++){
    System.out.print(arrayList.get(i)+" ");//get  returns the element at the specified position or -1 if element does not contain
    }
    System.out.println("\n");

    arrayList.clear();//removes all
    System.out.println(arrayList+"\n");

  }
}