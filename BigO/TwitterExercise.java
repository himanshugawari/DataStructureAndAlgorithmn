import java.util.*;

class Tweet{
  public String tweet;
  public String year;

  Tweet(String tweet,String year){
    this.tweet=tweet;
    this.year=year;
  }

  @Override
  public String toString(){
    return tweet +" "+year;
  }
}

public class TwitterExercise{

  public static void main(String[] args){
    String[] array=new String[]{"hi","my","teddy"};
    System.out.println(array[0]); // O(1)
    System.out.println(array[array.length-1]); // O(1)

    Tweet[] array1=new Tweet[]{new Tweet("hi","2012"), new Tweet("my","2014"), new Tweet("teddy","2018")};
    System.out.println(Arrays.toString(array1));
  }
}