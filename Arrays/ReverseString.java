import java.util.*;
import java.util.regex.Pattern;

public class ReverseString{
  public static void main(String[] args){
    String s="hi i am himanshu !";
    System.out.println(s+"\n");

    //String to array
    //method 1
    char[] c=new char[s.length()];
    for(int i=0;i<s.length();i++){
      c[i]=s.charAt(i);
    }
    System.out.println(Arrays.toString(c)+"\n");
    //method 2
    char[] c1=s.toCharArray();
    System.out.println(Arrays.toString(c1)+"\n");

    //convert String to String Array
    //method 1
    String[] words=s.split(" ");
    System.out.println(Arrays.toString(words)+"\n");
    //method 2
    Pattern p = Pattern.compile(" ");
    String[] words1=p.split(s);
    System.out.println(Arrays.toString(words1)+"\n");

    //Reverse String
    solution1(s);
    solution2(s);

  }

  public static void solution1(String s){
    System.out.println("Original String "+s);
    char[] arr=s.toCharArray();
    int l=0,h=arr.length-1;
    while(l<h){
      char temp=arr[l];
      arr[l]=arr[h];
      arr[h]=temp;
      l++;
      h--;
    }
    System.out.println("Reversed String "+new String(arr)+"\n");
  }

  public static void solution2(String s){
    System.out.println("Original String "+s);
    int len=s.length();
    char[] charArray=new char[len];
    char[] tempCharArray=new char[len];
    s.getChars(0, len, tempCharArray, 0);
    for(int i=0;i<len;i++){
      charArray[i]=tempCharArray[len-1-i];
    }
    System.out.println("Reversed String "+new String(charArray)+"\n");
  }
}