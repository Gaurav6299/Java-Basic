import java.util.*;
class HashTable
{
public static void main(String args[])
{
Hashtable<String,Integer> h=new Hashtable<>();
h.put("gaurav",153);
h.put("kushal",156);
h.put("ankit",245);
h.put("vikash",78);
System.out.println("HashTable is:"+h);

Hashtable<Integer,String> hs=new Hashtable<>();
hs.put(1,"cse");
hs.put(2,"mech");
hs.put(3,"ece");
System.out.println("Hashtable is:"+hs);
hs.forEach((k,v)->System.out.println(k+":"+v));
}
}