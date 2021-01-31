import java.util.concurrent.*;
import java.util.*;
class concurrent
{
public static void main(String args[])
{
ConcurrentHashMap<Integer,String> map=new ConcurrentHashMap<>();
map.put(1,"gaurav");
map.put(2,"kushal");
map.put(3,"sujit");
System.out.println("Map is:"+map);

map.putIfAbsent(4,"kumar");
map.putIfAbsent(5,"vikash");

System.out.println(map);
map.remove(2);
map.putIfAbsent(6,"lucky");
System.out.println(map);

ConcurrentHashMap<Integer,String> map1=new ConcurrentHashMap<>();
map1.putAll(map);
System.out.println("Map is :"+map1);
//String removeVal=map.remove(1);
//System.out.println("Remove value is:"+removeVal);

System.out.println(map.get(1));
for(Map.Entry<Integer,String> m:map.entrySet())
{
System.out.print("Key="+m.getKey()+":");
System.out.println("Value="+m.getValue());
}
}
}