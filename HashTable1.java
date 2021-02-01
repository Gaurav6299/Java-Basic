import java.util.*;
class HashTable1
{
public static void main(String args[])
{
Hashtable<Integer,String> ht=new Hashtable<>(3);
ht.put(1,"kumar");
ht.put(2,"gaurav");
ht.put(3,"sujit");
ht.put(4,"kushal");
System.out.println(ht);
Hashtable<Integer,String>hs=new Hashtable<>(ht);
System.out.println("Another" + "\"hashtable\" is:"+hs);
System.out.println(" \"gaurav\" ");
}
}
