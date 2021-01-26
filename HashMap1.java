import java.util.*;
class HashMap1
{
public static void main(String args[])
{
System.out.println("First HashMap is:");
HashMap<Integer,String> map=new HashMap<>(5);
map.put(1,"gaurav");
map.put(2,"sujit");
map.put(3,"kumar");
map.put(4,"Ankit");
map.put(5,"kushal");
map.put(6,"kunal");
System.out.println(map);
System.out.println("\nAnother map is:");
HashMap<Integer,String> map1=new HashMap<>(map);
System.out.println(map1);

HashMap<Integer,String> map2=new HashMap<>();
map2.putAll(map1);
System.out.println("\nThird HashMap is:"+map2);
}
}