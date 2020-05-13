import java.util.*;

class MyArray<X>{
  private int length;
  private final X[] data;

  MyArray(){
    this.length=0;
    this.data=(X[])new Object[1000];//creating and allocationg memory in heap 
  }

  public int size(){
    return length;
  }

  public X get(int index){
    return data[index];
  }

  public void push(X item){
    this.data[length++]=item;
  }

  public X pop(){
    if(length==0){
      throw new IllegalStateException("No more items");
    }
    return data[--length];
  }

  @Override
  public String toString(){
    return Arrays.toString(data);
  }

}

public class MyArrayImpl{
  MyArray<String> array=new MyArray<String>();

  public static void main(String[] args){
    MyArrayImpl arrayImpl=new MyArrayImpl();
    arrayImpl.insert();
    arrayImpl.display();
    arrayImpl.size();
    arrayImpl.display(0);
    arrayImpl.delete();
    arrayImpl.size();
    arrayImpl.display();
  }

  public void insert(){
    array.push("Himanshu");
    array.push("Hardik");
    array.push("Atsuko");
  }

  public void display(int i){
    System.out.println("Element at Index "+i+" is : " +array.get(i));
  }

  public void delete(){
    System.out.println("Deleted "+array.pop());
  }

  public void size(){
    System.out.println(array.size());
  }

  public void display(){
    for(int i=0;i<array.size();i++){
      System.out.print(array.get(i)+" " );
    }
    System.out.print("\n " );
  }
}