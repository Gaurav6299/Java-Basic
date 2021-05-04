import java.util.*;
class MapManner
{
public static void main(String args[])
{
Map<Integer,String>m=new HashMap<>();
m.put(1,"gaurav");
m.put(2,"kumar");
m.put(3,"kushal");
m.put(4,"vikash");
System.out.println(m);

for(Map.Entry<Integer,String> e:m.entrySet())
{
System.out.println(e.getKey()+" "+e.getValue());
}
for(Integer i:m.keySet())
{
System.out.println(i);
}
}
}