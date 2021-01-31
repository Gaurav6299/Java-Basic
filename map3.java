import java.util.*;
class map3
{
public static void main(String args[])
{
HashMap<Integer,String> map=new HashMap<>();
map.put(1,"gaurav");
map.put(2,"sujit");
map.put(3,"kushal");
System.out.println("Map is:"+map);

Iterator i=map.entrySet().iterator();
while(i.hasNext())
{
Map.Entry m=(Map.Entry)i.next();
int x=(int)m.getKey()+10;
System.out.println(x+": "+m.getValue());
}
}
}