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

        //Cpoy from Array using System.arraycopy
        /*public static void arraycopy(Object src, int srcPos,
                             Object dest, int destPos, int length)*/
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
			    'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(new String(copyTo)+"\n");

        //Arrays.sort  -- In-built Sorting
        int[] sortEx=new int[]{5,9,1,2,3,2,8,7,6,4};
        Arrays.sort(sortEx);
        System.out.println(Arrays.toString(sortEx));

  }
}