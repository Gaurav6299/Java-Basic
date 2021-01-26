import java.util.*;
class Map1
{
public static void main(String args[])
{
Map<String,Integer> map=new HashMap<>();
map.put("gaurav",153);
map.put("sujit",123);
map.put("kushal",153);
map.put("vikash",78);
map.put("vikash",270);

System.out.println("Map is:"+map);
for(Map.Entry<String,Integer> m:map.entrySet())
{
System.out.println(m.getKey()+":"+ m.getValue());
}

map.remove("gaurav");
map.remove("sujit");
System.out.println("After deletion map is:"+map);
}
}