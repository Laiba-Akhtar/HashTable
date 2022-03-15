import java.util.Hashtable;
public class HashTable {
    public static void main(String[] args) {
        //ANY FIVE METHODS
        //PUT,GET,CLEAR,CONTAIN,REPACE
        Hashtable<Integer , Integer> l=new Hashtable<>(10);
        l.put(22, 2);
        l.put(12, 4);
       l.put(32, 9);
       System.out.println("Get value from 32 key="+ l.get(22));
       System.out.println("Get value from 32 key="+ l.get(12));
      System.out.println("Get value from 32 key="+ l.get(32));
      System.out.println(l.contains(4));

      System.out.println("Replacing 2 by 3 at key(22)="+l.replace(22, 2, 3));
      System.out.println("Get value at 22="+ l.get(22));
      l.clear();
      System.out.println("Checking value at key(32)="+ l.get(32));
      System.out.println(l.contains(4));
       
    }
}
