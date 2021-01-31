import java.util.*;
class MapClone
{
public static void main(String args[])
{
HashMap<Integer,Integer> map=new HashMap<>();
map.put(1,2);
map.put(2,3);
map.put(3,5);
map.put(4,10);

HashMap<Integer,Integer> map1=new HashMap<>();
for(Map.Entry<Integer,Integer>m:map.entrySet())
{
map1.put(m.getKey(),m.getValue());
}

System.out.println(map);
System.out.println(map1);
}
}