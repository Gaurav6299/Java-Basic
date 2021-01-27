import java.util.*;
class weak2
{
public static void main(String args[])
{
Map<Integer,String> map=new WeakHashMap<>();
map.put(1,"gaurav");
map.put(2,"kushal");
map.put(3,"kumar");
map.put(4,"vikash");
System.out.println(map);

Set s=map.entrySet();
System.out.println("Set is:"+s);

Set s1=map.keySet();
System.out.println("Set Key:"+s1);

Collection s2=map.values();
System.out.println("Map values in Set:"+s2);
Map<Integer,String> map2=new WeakHashMap<>();
map2.putAll(map);
System.out.println(map2);
System.out.println(map2.size());
}
}