import java.util.*;
class immuta1
{
public static void main(String args[])
{
Map<Integer,String> map=new HashMap<>();
map.put(1,"gaurav");
map.put(2,"sujit");
map.put(3,"kumar");
map.put(4,"kushal");
map.put(5,"vikash");
System.out.println("Map is: " +map);

Map<Integer,String> map1=Map.copyOf(map);
map1.put(6,"kunal");
System.out.println("Another map is:"+map1);
}
}