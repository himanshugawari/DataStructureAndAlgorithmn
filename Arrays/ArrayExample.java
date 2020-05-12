import java.util.*;

public class ArrayExample{
  public static void main(String[] args){

    char[] t={'a','b','c'};
    System.out.println(Arrays.toString(t)+"\n");

    int[] a=new int[5];
    a=new int[]{1,2,3,4,5};
    System.out.println(Arrays.toString(a)+"\n");

    int[] b=new int[]{6,7,8,9,10};
    System.out.println(Arrays.toString(b)+"\n");

    for(Integer i: a){
      System.out.print(i +" ");
    }
    System.out.format("\n\n");

    for(int i=0;i<b.length;i++){
      System.out.print(b[i] +" ");
    }
    System.out.format("\n\n");

    //2D or Matrix --Array
    int[][] c={{1,2,3},{2,3,4},{3,4,5}};
    System.out.println(Arrays.toString(c)+"\n");//prints code use deepTOString
    System.out.println(Arrays.deepToString(c)+"\n");

    int[][] d=new int[3][3];
    d=new int[][]{{1,2,3},{2,3,4},{3,4,5}};
    System.out.println(Arrays.deepToString(d)+"\n");

    String[][] names = {
            {"Mr. ", "Mrs. ", "Ms. "},
            {"Himanshu", "Atsuko"}
        };
        // Mr. Himanshu
        System.out.println(names[0][0] + names[1][0]);
        // Ms. Atsuko
        System.out.println(names[0][2] + names[1][1]+"\n");

    //Cpoy from Array using System.arraycopy  and Arrays.copyOfRange
    /*public static void arraycopy(Object src, int srcPos,
                             Object dest, int destPos, int length)*/
    char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
    char[] copyTo = new char[7];
    System.arraycopy(copyFrom, 2, copyTo, 0, 7);
    System.out.println(new String(copyTo));
    char[] copy2 = Arrays.copyOfRange(copyFrom,2,9);
    System.out.println(Arrays.toString(copy2)+"\n");


    //Arrays.sort  -- In-built Sorting
    int[] sortEx=new int[]{5,9,1,2,3,2,8,7,6,4};
    Arrays.sort(sortEx);
    System.out.println(Arrays.toString(sortEx)+"\n");

    //Arrays.binarySearch  -- In-built Sorting
    int[] searchEx=new int[]{5,9,1,2,3,2,8,7,6,4};
    Arrays.sort(searchEx);
    System.out.println(Arrays.binarySearch(searchEx,15));
    System.out.println(Arrays.binarySearch(searchEx,9)+"\n");
    
    //Equals
    System.out.println(sortEx.equals(searchEx));
    System.out.println(sortEx.equals(sortEx)+"\n");

    //Fill
    String[] arr=new String[10];
    Arrays.fill(arr,"hi");
    System.out.println(Arrays.toString(arr));
    String[] arr1=new String[10];
    Arrays.fill(arr1,4,6,"hi");
    System.out.println(Arrays.toString(arr1)+"\n");

    //copyOf and copyOfRange
    char[] cp={'a','b','c','d','e','f','g','h','i','j'};
    char[] cp1=Arrays.copyOf(cp,5);
    System.out.println(new String(cp1));
    char[] cp2=Arrays.copyOfRange(cp,5,9);
    System.out.println(new String(cp2)+"\n");

    //Clone
    char[] cloneA={'a','b','c','d','e'};
    char[] cloneOfcloneA=cloneA.clone();
    System.out.println(new String(cloneOfcloneA)+"\n");

    //hashcode
    char[] hash1=new char[]{'a','b','c','d','e','f','g','h','i','j'};
    char[] hash2=new char[]{'a','b','c','d','e','f','g','h','i','j'};
    System.out.println(Arrays.equals(hash1, hash2));
    System.out.println(Arrays.hashCode(hash1));
    System.out.println(Arrays.hashCode(hash2));
    System.out.println(Arrays.hashCode(hash1)==Arrays.hashCode(hash2));
    System.out.format("\n");

    //equal same as deepEqual for nested elements
    //toString same as deepToString for nested elements
    //hashCode same as deepHashCode for nested elements

    //Array to List using asList
    List<String> list=Arrays.asList("himanshu","hardik","atsuko");
    System.out.println(list.toString());
    String[] list1=new String[]{"himanshu","hardik","atsuko"};
    System.out.println(Arrays.asList(list1).toString()+"\n");

    //Collection to Object[]
    List<String> lis=Arrays.asList("himanshu","hardik","atsuko");
    System.out.println(Arrays.toString(lis.toArray())+"\n");

    //List to Array
    List<String> temp=new ArrayList<>();
    temp.add("himanshu");
    temp.add("hardik");
    temp.add("atsuko");
    System.out.println(temp.toString());
    String[] liToArr=Arrays.copyOf(temp.toArray(),temp.size(),String[].class);
    System.out.println(Arrays.toString(liToArr)+"\n");

  }
}