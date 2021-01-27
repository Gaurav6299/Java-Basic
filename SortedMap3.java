import java.util.*;
class SortedMap3
{
public static void main(String args[])
{
SortedMap<String,String> map=new TreeMap<String,String>();
map.put("gaurav","1");
map.put("kumar","2");
map.put("sujit","4");
map.put("kushal","3");
System.out.println("Map is:"+map);
map.remove("gaurav");
System.out.println(map);
System.out.println(map.firstKey());
System.out.println(map.lastKey());
System.out.println(map.containsKey("kumar"));
}
}