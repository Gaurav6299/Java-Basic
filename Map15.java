import java.util.*;
class Map15
{
public static void main(String args[])
{
Map<Integer,String> map=new HashMap<>();
map.put(1,"gaurav");
map.put(2,"kushal");
map.put(3,"vikash");
map.put(4,"yellow");
System.out.println(map);

for(Map.Entry<Integer,String> m:map.entrySet())
{
System.out.println(m.getKey()+" "+m.getValue());
}

for(Integer i:map.keySet())
{
if(map.get(i)=="gaurav")
{
System.out.println(i);
}
}
}
}