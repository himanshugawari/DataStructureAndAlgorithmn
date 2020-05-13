import java.util.*;

//Simple implenentation.
//Data insertion in case of collision is not implemnted.

class Data{
  private String key;
  private int value;

  Data(String key,int value){
    this.key=key;
    this.value=value;
  }

  public String getData(){
    String v=String.valueOf(this.value);
    return this.key+" "+v;
  }
}


class HashTable{
  private int length;
  private Data[] data;
  HashTable(int size){
    this.length=size;
    this.data= new Data[size];
  }

  public int hashCode(String key){
    int hash = 0 , R=31;
    for (int i = 0; i < key.length(); i++){
     hash = ( R * hash + key.charAt(i)) % this.length;
     //System.out.println(hash);
    }
    System.out.println(hash);
    return hash;
  }

  public void set(String key, int value){
    int address=hashCode(key);
    if(data[address]==null){
      this.data[address]=new Data(key,value);
      System.out.println(this.data[address].getData());
      //System.out.println(getContent());
    }else{
      this.data[address]=new Data(key,value);
      System.out.println(this.data[address].getData());
    }
  }

  public String get(String key){
    int address=hashCode(key);
    return this.data[address].getData();
  }
}

public class HashTableImpl{
  HashTable hashTable=new HashTable(50);
  public static void main(String[] args){
    HashTableImpl impl=new HashTableImpl();
    impl.setContent("grapes",1000);
    impl.setContent("apples",54);
    impl.setContent("mangoes",589);
    impl.getContent("grapes");
    impl.getContent("apples");
    impl.getContent("mangoes");
  }

  public void setContent(String key,int value){
    hashTable.set(key,value);
    //System.out.println(hashTable.set(key,value));
  }

  public void getContent(String key){
    System.out.println(hashTable.get(key));
  }
}