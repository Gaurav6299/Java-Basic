import java.util.*;
class TreeMap1
{
public static void main(String args[])
{
Map<Integer,Integer> map=new TreeMap<>(Collections.reverseOrder());
map.put(2,90);
map.put(4,89);
map.put(1,23);
map.put(2,67);
System.out.println(map);
}
}