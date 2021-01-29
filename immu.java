import java.util.*;
class immu
{
static void immutable(Map<Integer,String> map)
{
map=Collections.unmodifiableMap(map);
map.put(5,"kushal");
System.out.println(map);
}
public static void main(String args[])
{
Map<Integer,String> map=new HashMap<>();
map.put(1,"gaurav");
map.put(2,"sujit");
map.put(3,"vikash");
immutable(map);
}
}