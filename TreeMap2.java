import java.util.*;
class TreeMap2
{
public static void main(String args[])
{
TreeMap<Integer,String> map=new TreeMap<>(Collections.reverseOrder());
map.put(10,"gaurav");
map.put(2,"sujit");
map.put(3,"kumar");
map.put(11,"ankit");
System.out.println("treeMap is:"+map);
if(map.containsKey(12))
{
System.out.println("Yes");
}

else
{
System.out.println("NO");
}

map.remove(2);
System.out.println(map);
}
}