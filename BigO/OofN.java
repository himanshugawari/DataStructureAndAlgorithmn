import java.util.*;

public class OofN{

  public static void main(String[] args){
    String[] name=new String[]{"nemo"};
    String[] everyOne=new String[]{"dory","bruce","marlin","nemo","gill","bloat", "nigel", "squirt", "darla", "hank"};
    String[] large=new String[10000];
    Arrays.fill(large,"nemo");

    //findNemo(name);
    //findNemo(everyOne);
    findNemo(large);
  }

  public static void findNemo(String[] array){
    //long startTime=System.nanoTime(); //In nanoseconds
    long startTime=System.currentTimeMillis(); //In milliseconds
    //long startTime=new Date().getTime(); //In milliseconds
    //long startTime = Calendar.getInstance().getTime().getTime(); //In milliseconds

    for(int i=0;i<array.length;i++){
      //if(array[i]=="nemo"){
      if(array[i].equals("nemo")){
        System.out.println("Found Nemo!");
      }
    }

    //long endTime=System.nanoTime();
    long endTime=System.currentTimeMillis();
    //long endTime=new Date().getTime();
    //long endTime = Calendar.getInstance().getTime().getTime();

    long timeElapsed=endTime-startTime;

    System.out.println("Finding Nemo call took "+timeElapsed);
  }

}